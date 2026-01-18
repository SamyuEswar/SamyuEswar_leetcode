class Solution {
    public int maximumWealth(int[][] a) {
       int m=0;
       for(int i=0;i<a.length;i++){
            int s=0;
            for(int j=0;j<a[i].length;j++){
                s+=a[i][j];
            }
            if(s>m) m=s;
       }
       return m;
    }
}