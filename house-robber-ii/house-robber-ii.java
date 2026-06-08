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
        if(nums.length ==1) return nums[0];
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int a=f(nums.length-2,nums,dp);
        Arrays.fill(dp,-1);
        int[] arr=new int[nums.length-1];
        for(int i=1;i<nums.length;i++){
            arr[i-1]=nums[i];
        }
        int b=f(nums.length-2,arr,dp);
        return Math.max(a,b);
    }
}