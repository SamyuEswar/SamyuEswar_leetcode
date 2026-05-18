class Solution {
    public int[] twoSum(int[] nums, int t) {
        int[] a=new int[2];
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=t-nums[i];
            if(!h.containsKey(c)){
                h.put(nums[i],i);
            }
            else{
                a[0]=h.get(c);
                a[1]=i;
            }
        }
        return a;
    }
}