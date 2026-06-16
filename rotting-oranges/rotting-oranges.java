class Solution {
    class Pair {
        int row, col;
        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] vis = new int[n + 1][m + 1];
        int fresh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j));
                    vis[i][j] = 1;
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0)
            return 0;
        int count = 0;
        int[] drow = { -1, 0, 1, 0 };
        int[] dcol = { 0, 1, 0, -1 };
        while (!q.isEmpty() && fresh > 0) {
            int ele = q.size();
            for (int i = 0; i < ele; i++) {
                Pair node = q.poll();
                int r = node.row;
                int c = node.col;
                for (int j = 0; j < 4; j++) {
                    int nrow = r + drow[j];
                    int ncol = c + dcol[j];
                    if (nrow >= 0 && nrow < n &&
                            ncol >= 0 && ncol < m &&
                            grid[nrow][ncol] == 1) {
                        grid[nrow][ncol] = 2;
                        fresh--;
                        q.offer(new Pair(nrow, ncol));
                    }
                }
            }
            count++;
        }
        return fresh == 0 ? count : -1;
    }
}
