class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length,m=0,r=0,k=0;
        int[] a=new int[n*n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[k++]=grid[i][j];
            }
        }
        Arrays.sort(a);
        k=1;
        for(int i=0;i<a.length;i++){
            if(i<a.length-1 && a[i]==a[i+1] ) {
                r=a[i];
                continue;
            }
            if(k!=a[i] && m==0) m=k;
            k++;
        }
        if(m==0) m=k;
        return new int[]{r,m};
    }
}