class Solution {
    int f(int i,int buy,int[][][]dp,int[]p,int k){
        if(k==0) return 0;
        if(i>=p.length) return 0;
        if(dp[i][buy][k]!=-1) return dp[i][buy][k];
        int profit=0;
        if(buy==1){ // you are eligible to buy
            int bought = -p[i]+f(i+1,0,dp,p,k); //buy on this day
            int skip = 0+f(i+1,1,dp,p,k); //skip this day in future to buy something
            profit += Math.max(bought,skip);
        }
        else{ //eligible to sell
            int sell = p[i]+f(i+1,1,dp,p,k-1); //sell on this day and reduce the k because one transaction is completed
            int skip = 0+f(i+1,0,dp,p,k); //sell in future
            profit += Math.max(sell,skip); 
        }
        dp[i][buy][k] = profit;
        return dp[i][buy][k];
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int k=2;//0 or 1 or 2 transaction
        int [][][] dp = new int[n][2][k+1];
        for(int [][] row : dp){
            for(int [] r : row)
            Arrays.fill(r,-1);
        }
        //initially we eligible to buy so put buy as 1
        int ans = f(0,1,dp,prices,k);
        return ans;
    }
}