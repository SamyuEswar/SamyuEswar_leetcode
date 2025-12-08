class Solution {
    public int countTriples(int n) {
        int a=0,d;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                int c=i*i+j*j;
                d=(int)Math.sqrt(c);
                if(d<=n && d*d==c) a++;
            }
        }
        return a;
    }
}