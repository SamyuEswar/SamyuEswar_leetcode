class Solution {
    public int differenceOfSum(int[] nums) {
        int s=0,a=0,n;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            n=nums[i];
            while(n>0){     
                int r=n%10;
                a+=r;
                n=n/10;
            }
        }
        if(a>s) return a-s;
        else return s-a;
    }
}