class Solution {
    public int specialTriplets(int[] nums) {
        long MOD = 1_000_000_007;
        
        Map<Integer, Long> left = new HashMap<>();
        Map<Integer, Long> right = new HashMap<>();

        // Fill right map initially
        for (int x : nums) {
            right.put(x, right.getOrDefault(x, 0L) + 1);
        }

        long ans = 0;

        for (int j = 0; j < nums.length; j++) {
            int x = nums[j];

            // Remove current index from right side
            right.put(x, right.get(x) - 1);

            long target = 2L * x;

            long leftCount  = left.getOrDefault((int) target, 0L);
            long rightCount = right.getOrDefault((int) target, 0L);

            ans = (ans + leftCount * rightCount) % MOD;

            // Add current element to left map
            left.put(x, left.getOrDefault(x, 0L) + 1);
        }

        return (int) ans;
    }
}
