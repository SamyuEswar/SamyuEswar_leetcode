class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l=new ArrayList<>();
        boolean[] b=new boolean[(nums.length)+1];
        for(int n:nums){
            b[n]=true;
        }
        for(int i=1;i<=nums.length;i++){
            if(!b[i]) l.add(i);
        }
        return l;
    }
}