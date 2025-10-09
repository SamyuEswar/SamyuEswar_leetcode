class Solution {
    public int search(int[] nums, int t) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]==t) return m;
            else if(nums[m]>t) r=m-1;
            else l=m+1;
        }
        return -1;
    }
}