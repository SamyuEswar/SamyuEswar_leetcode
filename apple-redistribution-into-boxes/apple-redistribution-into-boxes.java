class Solution {
    public int minimumBoxes(int[] a, int[] c) {
        int z=0;
        Arrays.sort(c);
        int y=0;
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        for(int j=c.length-1;j>=0;j--){
            y+=c[j];
            z++;
            if(y>=s) break;
            else continue;
        }
        return z;
    }
}