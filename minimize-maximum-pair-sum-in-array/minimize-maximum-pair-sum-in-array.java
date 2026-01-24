class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            s = Math.max(s, nums[l] + nums[r]);
            l++;
            r--;
        }
        return s;   
    }
}