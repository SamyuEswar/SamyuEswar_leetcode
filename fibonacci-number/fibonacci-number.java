class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int p1=1,p2=0;
        for(int i=2;i<=n;i++){
            int c=p1+p2;
            p2=p1;
            p1=c;
        }
        return p1;
    }
}