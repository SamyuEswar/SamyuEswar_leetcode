class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long z=0,a=0;
        if(k<n || k<m){
            if(k<n) z=n;
            if(k<m) z=m;
            while(z>k){
                z--;
                a++;
            }
            return z*a;
        }
        else return 0;
    }
}