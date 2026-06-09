class Solution {
    public int f(int i,int j,int[][] dp, String s, String t){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            dp[i][j]=1+f(i-1,j-1,dp,s,t);
            return dp[i][j];
        }
        int left=f(i-1,j,dp,s,t);
        int right=f(i,j-1,dp,s,t);
        dp[i][j]=Math.max(left,right);
        return dp[i][j];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int[][] dp= new int[m][n];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        int a=f(m-1,n-1,dp,text1,text2);
        return a;
    }
}