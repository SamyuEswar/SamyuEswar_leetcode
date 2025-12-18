class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int a[]=new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1 || nums[i]!=nums[i+1] ){
                a[j]=nums[i];
                j++;
            }
            else i++;
        }
        return a;
    }
}