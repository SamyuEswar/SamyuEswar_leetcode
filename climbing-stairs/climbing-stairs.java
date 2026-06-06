class Solution {
    public int f(int n,int[] dp){
        if(n==1 || n==2) {
            dp[n]=n;
            return dp[n];
        }
        if(dp[n]!=-1) {
            return dp[n];
        }
        int o=f(n-1,dp);
        int t=f(n-2,dp);
        dp[n]=o+t;
        return  dp[n];
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return f(n,dp);        
    }
}