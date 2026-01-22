class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int j=1;
        for(int i=0;i<nums.size();i++){
            if(j>nums[i]) continue;
            if(j==nums[i]) j++;             
        }
        return j;
    }
};