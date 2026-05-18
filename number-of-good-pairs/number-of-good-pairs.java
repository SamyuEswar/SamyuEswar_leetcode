class Solution {
    public int numIdenticalPairs(int[] nums) {
        int s=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=nums[i];
            if(!h.containsKey(c)){
                h.put(c,1);
            }
            else{
                s=h.get(c)+s;
                h.put(c,h.get(c)+1);
            }
        }
        return s;
    }
}