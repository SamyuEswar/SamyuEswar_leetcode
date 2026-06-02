class Solution {
    public long countSubarrays(int[] n, long k) {
        int l=0;
        long s1=0,ct=0,s=0;
        for(int r=0;r<n.length;r++){
            s+=n[r];
            s1=s*(r-l+1);
            while(s1>=k){
                s-=n[l];
                l++;
                s1=s*(r-l+1);
            }
            ct+=r-l+1;
        }
        return ct;
    }
}