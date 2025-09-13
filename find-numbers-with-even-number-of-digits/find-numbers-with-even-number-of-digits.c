int findNumbers(int* nums, int numsSize) {
    int w=0;
    for(int i=0;i<numsSize;i++){
       if((nums[i]>=10 && nums[i]<99)|| (nums[i]>=1000 && nums[i]<=9999) || nums[i]==100000 ) w++;
    }
    return w;
}