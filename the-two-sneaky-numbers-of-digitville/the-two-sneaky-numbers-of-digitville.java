class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] p=new int[(nums.length+1)];
        int[] d=new int[2];
        Arrays.fill(p, 0);
        for(int i=0;i<nums.length;i++){
            p[nums[i]]++;
        }
        int j=0;
        for(int i=1;i<=nums.length;i++){
            if(p[i]==2) {
                d[j]=i;
                j++;
            }
        }
        return d;
    }
}
