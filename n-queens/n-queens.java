class Solution {
    void f(int col,int n,int[][]board,List<List<String>> ans){
        if(col==n){
            addToAns(board,ans);
            return ;
        }
        for(int row=0;row<n;row++){
            if(isSafe(row,col,n,board)){
                board[row][col]=1;
                f(col+1,n,board,ans);
                board[row][col]=0; //backtrack
            }
        }
    }

    Boolean isSafe(int row,int col,int n,int[][] board){
        //for left row checking
        for(int c=0;c<=col-1;c++){
            if(board[row][c]==1) return false;
        }
        //for left upper diagonal checking
        for(int r=row,c=col;r>=0 && c>=0;r--,c--){
            if(board[r][c]==1) return false;
        }
        //for left lower diagonal checking
        for(int r=row,c=col;r<=n-1 && c>=0;r++,c--){
            if(board[r][c]==1) return false;
        }
        return true;
    }

    void addToAns(int[][] board ,List<List<String>> ans){
        int m=board.length;
        int n=board[0].length;
        List<String> temp =new ArrayList<>();
        for(int i=0;i<m;i++){
            StringBuilder s=new StringBuilder("");
            for(int j=0;j<n;j++){
                if(board[i][j]!=1) s.append('.');
                else s.append('Q');
            }
            temp.add(s.toString());
        }
        ans.add(temp);
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        int[][] board = new int[n][n];
        f(0, n, board, ans);
        return ans;
    }
}