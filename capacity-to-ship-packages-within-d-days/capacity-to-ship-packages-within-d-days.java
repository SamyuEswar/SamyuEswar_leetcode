class Solution {
    public int f(int cap,int[] w){
        int d=1,c=0;
        for(int i=0;i<w.length;i++){
            c+=w[i];
            if(c>cap){
                d++;
                c=w[i];
            }
        }
        return d;
    }
    public int shipWithinDays(int[] w, int days) {
        int l=Integer.MIN_VALUE,h=1;
        for(int i=0;i<w.length;i++){
            h+=w[i];
            l=Math.max(l,w[i]);
        }
        while(l<=h){
            int m=(l+h)/2;
            int d=f(m,w);
            if(d>days){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return l;
    }
}