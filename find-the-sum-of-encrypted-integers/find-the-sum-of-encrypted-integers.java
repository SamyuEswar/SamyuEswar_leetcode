class Solution {
    public int sumOfEncryptedInt(int[] n) {
        int s=0;
        for(int i=0;i<n.length;i++){
            int r=0,c=0,a=0;
            while(n[i]>0){
                c++;
                int l=n[i]%10;
                if(r<l) r=l;
                n[i]=n[i]/10;
            }
            for(int j=1;j<=c;j++){
                a=a*10+r;
            }
            s+=a;
        }
        return s;
    }
}