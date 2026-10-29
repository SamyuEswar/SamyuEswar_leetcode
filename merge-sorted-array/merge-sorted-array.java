class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<m;i++){
            a.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            a.add(nums2[i]);
        }
        a.sort(null);
        for (int i = 0; i < m + n; i++) {
            nums1[i] = a.get(i);
        }
    }
}