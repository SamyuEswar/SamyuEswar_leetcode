class Solution {
    int f(int i,int[] nums,int[] dp){
        if(i<0) return 0;
        if(i==0) return nums[i];
        if(dp[i]!=-1) return dp[i];
        int np=0+f(i-1,nums,dp);
        int p=nums[i]+f(i-2,nums,dp);
        dp[i]=Math.max(np,p);
        return dp[i];  
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int a=f(nums.length-1,nums,dp);
        return a;
    }
}