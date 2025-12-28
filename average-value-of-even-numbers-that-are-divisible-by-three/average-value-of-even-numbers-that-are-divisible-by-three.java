class Solution {
    public int averageValue(int[] nums) {
        int c=0,s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==0 && nums[i]%2==0) {
                c++;
                s+=nums[i];
            }
        }
        if(c!=0) return s/c;
        return 0;
    }
}