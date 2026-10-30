class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length,m=n-k;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=m;i<n;i++){
            a.add(nums[i]);
        }
        for(int i=0;i<m;i++){
            a.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            nums[i]=a.get(i);
        }
    }
}