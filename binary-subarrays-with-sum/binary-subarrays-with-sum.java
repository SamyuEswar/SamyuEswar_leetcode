class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        int f1=f(nums,k);
        if(k==0) return f1;
        int f2=f(nums,k-1);
        return f1-f2;
    }
    public int f(int[] nums,int k){
        int l=0,s=0,c=0;
        for(int r=0;r<nums.length;r++){
            s+=nums[r];
            while(s>k){
                s-=nums[l];
                l++;
            }
            c+=(r-l+1);
        }
        return c;
    }
}