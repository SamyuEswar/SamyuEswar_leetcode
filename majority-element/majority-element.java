class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int c=1,max=1,j=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]) {
                c++;
            }
            else {
                if(c>max) {
                    max=c;
                    j=nums[i-1];
                }
                c=1;
            }
        }
        if(c>max) j=nums[n-1];
        return j;
    }
}