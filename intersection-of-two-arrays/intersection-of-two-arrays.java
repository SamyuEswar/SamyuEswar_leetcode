class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]) h.add(nums1[i]);
            }
        }
        int[] z=new int[h.size()];
        int i=0;
        for(int a:h){
            z[i++]=a;
        }
        return z;
    }
}