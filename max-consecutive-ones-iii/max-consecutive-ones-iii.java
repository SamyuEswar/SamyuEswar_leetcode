class Solution {
    public int longestOnes(int[] n, int k) {
        int l=0,z=0,m=0;
        for(int r=0;r<n.length;r++){
            if(n[r]==0) z++;
            while(z>k){
                if(n[l]==0) z--;
                l++;
            }
            m=Math.max(m,(r-l+1));
        }
        return m;
    }
}