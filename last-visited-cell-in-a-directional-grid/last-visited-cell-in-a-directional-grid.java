class Solution {
    public int[] lastVisitedCell(char[][] g) {
        int m=g.length;
        int n=g[0].length;
        boolean[][] v=new boolean[m][n];
        int r=0,c=0;
        v[r][c]=true;
        while(true){
            int nr=r,nc=c;
            switch(g[r][c]){
                case 'L' : 
                    nc--;
                    break;
                case 'R' :
                    nc++;
                    break;
                case 'U':
                    nr--;
                    break;
                case 'D':
                    nr++;
                    break;
            }
            if(nr>=0 && nr<m && nc>=0 && nc<n && !v[nr][nc]){
                r=nr;
                c=nc;
                v[r][c]=true;
            }
            else{
                break;
            }
        }
        return new int[]{r,c};
    }
}