class Solution {
    public int[][] transpose(int[][] m) {
        int r=m.length,c=m[0].length;
        int[][] b=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                b[i][j]=m[j][i];
            }
        }
        return b;
    }
}