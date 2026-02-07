class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        boolean[] a = new boolean[101];
        boolean[] b = new boolean[101];
        boolean[] c = new boolean[101];
        for (int x : nums1) a[x] = true;
        for (int x : nums2) b[x] = true;
        for (int x : nums3) c[x] = true;
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            if (a[i]) count++;
            if (b[i]) count++;
            if (c[i]) count++;
            if (count >= 2) res.add(i);
        }
        return res;
    }
}
