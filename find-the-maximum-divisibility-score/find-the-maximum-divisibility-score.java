class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int m=Integer.MAX_VALUE,c=0,a=0;
        for(int i=0;i<divisors.length;i++){
            for(int j=0;j<nums.length;j++) {
                if(nums[j]%divisors[i]==0) c++;
            }
            if(c>a) {
                a=c;
                m=divisors[i];
            }
            else if(c==a){
                if(m>divisors[i]){
                    m=divisors[i];
                }
            }
            c=0;
        }   
        return m;
    }
}