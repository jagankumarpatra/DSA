class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        // dp[i][j] = maximum dot product using
        // nums1[i..end] and nums2[j..end]
        int[][] dp = new int[n + 1][m + 1];

        // Important: initialize with very small value
        // because subsequence must be NON-empty
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }

        // Base case: when one array is exhausted
        // no non-empty subsequence possible
        for (int i = 0; i <= n; i++) dp[i][m] = Integer.MIN_VALUE;
        for (int j = 0; j <= m; j++) dp[n][j] = Integer.MIN_VALUE;

        // Fill DP from bottom-right to top-left
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                // Choice 1: take both elements
                int takeBoth = nums1[i] * nums2[j];
                if (dp[i + 1][j + 1] > 0) {
                    takeBoth += dp[i + 1][j + 1];
                }

                // Choice 2: skip nums1[i]
                int skipNums1 = dp[i + 1][j];

                // Choice 3: skip nums2[j]
                int skipNums2 = dp[i][j + 1];

                // Take the best of all choices
                dp[i][j] = Math.max(takeBoth, Math.max(skipNums1, skipNums2));
            }
        }

        return dp[0][0];
    }
}
