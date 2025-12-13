class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int[] p=new int[(nums.length+1)];
        Arrays.fill(p, 0);
        for(int i=0;i<nums.length;i++){
            p[nums[i]]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(p[i]==2) l.add(i);
        }
        return l;
    }
}

