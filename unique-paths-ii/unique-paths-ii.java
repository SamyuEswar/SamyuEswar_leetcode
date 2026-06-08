class Solution {
    int f(int i, int j, int[][] dp, int[][] o) {
        if (i < 0 || j < 0)
            return 0;
        if (o[i][j] != 1) {
            if (i == 0 && j == 0)
                return dp[i][j] = 1;
            if (dp[i][j] != -1)
                return dp[i][j];
            int up = f(i - 1, j, dp, o);
            int left = f(i, j - 1, dp, o);
            dp[i][j] = up + left;
            return dp[i][j];
        } else {
            return 0;
        }
    }

    public int uniquePathsWithObstacles(int[][] o) {
        int m = o.length;
        int n = o[0].length;
        int[][] dp = new int[m][n];
        for (int[] rows : dp) {
            Arrays.fill(rows, -1);
        }
        int a = f(m - 1, n - 1, dp, o);
        return a;
    }
}