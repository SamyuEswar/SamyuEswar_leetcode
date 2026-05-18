class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>h = new HashMap<>();
        int xor=0;
        for(int n:nums){
            xor=xor^n;
        }
        return xor;
    }
}