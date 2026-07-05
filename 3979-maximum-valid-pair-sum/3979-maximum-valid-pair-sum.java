class Solution {
    public int maxValidPairSum(int[] nums, int k) {
            int n = nums.length;

        int maxPrev = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;

        for (int j = k; j < n; j++) {
            // Index j-k has now become valid
            maxPrev = Math.max(maxPrev, nums[j - k]);

            // Best valid pair ending at j
            ans = Math.max(ans, maxPrev + nums[j]);
        }

        return ans;
    }
}

