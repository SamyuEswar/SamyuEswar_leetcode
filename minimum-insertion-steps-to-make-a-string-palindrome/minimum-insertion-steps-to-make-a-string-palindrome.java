class Solution {
    public int f(int i,int j,int[][]dp,String s){
        if(i==j) return 1;
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]=2+f(i+1,j-1,dp,s);
            return dp[i][j];
        }
        int left=f(i+1,j,dp,s);
        int right=f(i,j-1,dp,s);
        dp[i][j]=Math.max(left,right);
        return dp[i][j];
    }
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp= new int[n][n];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        int a=f(0,n-1,dp,s);
        return a;
    }
    public int minInsertions(String s) {
        int lps=longestPalindromeSubseq(s);
        int n=s.length();
        return n-lps;
    }
}