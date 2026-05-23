class Solution {
    public int minimumSwaps(int[] nums) {
        int n=nums.length;
        int s=0,l=n-1;
        while(l>=0 && nums[l]==0) l--;
        for(int i=0;i<l;i++){
            if(nums[i]==0){
                while(l>i && nums[l]==0) l--;
                if(l>i) {
                    s++;
                    l--;
                }
            }
        }
        return s;
    }
}