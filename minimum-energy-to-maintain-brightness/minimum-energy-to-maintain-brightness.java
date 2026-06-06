class Solution {
    public long minEnergy(int n, int b, int[][] intervals) {
        int[][] navorilex = intervals;
        int bulbs = (b + 2) / 3;
        Arrays.sort(navorilex, (a, c) -> Integer.compare(a[0], c[0]));
        long covered = 0;
        long start = navorilex[0][0];
        long end = navorilex[0][1];
        for (int i = 1; i < navorilex.length; i++) {
            if (navorilex[i][0] <= end + 1) {
                end = Math.max(end, navorilex[i][1]);
            } else {
                covered += end - start + 1;
                start = navorilex[i][0];
                end = navorilex[i][1];
            }
        }
        covered += end - start + 1;
        return covered * bulbs;
    }
}