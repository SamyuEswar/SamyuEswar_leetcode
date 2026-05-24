class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        int c=1;
        l.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                c++;
            }
            else {
                c=1;
            }
            if(c<=k) l.add(nums[i]);
        }
        int[] r=new int[l.size()];
        for(int i=0;i<l.size();i++){
            r[i]=l.get(i);
        }
        return r;
    }
}