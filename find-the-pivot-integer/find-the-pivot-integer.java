class Solution {
    public int pivotInteger(int n) {
        int t=0,l=0;
        for(int i=1;i<=n;i++){
            t+=i;
        }
        for(int i=1;i<=n;i++){
            l+=i;
            if(l==t) return i;
            t-=i;
        }
        return -1; 
    }
}