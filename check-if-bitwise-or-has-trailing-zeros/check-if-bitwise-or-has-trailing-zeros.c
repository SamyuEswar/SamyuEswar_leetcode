bool hasTrailingZeros(int* nums, int numsSize) {
    int e=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]%2==0) e++;
    }
    return e>=2;
}