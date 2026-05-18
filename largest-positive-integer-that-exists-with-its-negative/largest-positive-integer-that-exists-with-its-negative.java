class Solution {
    public int findMaxK(int[] nums) {
        int k=-1;
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=nums[i];
            // if(nums[i]<0) {
            //     c=Math.abs(nums[i]);
            // }
            // else{
            //     c=nums[i];
            // }
            if(!h.containsKey(-c)){
                h.put(c,i);
            }
            else{
                if(Math.abs(c)>k) k=Math.abs(c);
            }
        }
        return k;
    }
}