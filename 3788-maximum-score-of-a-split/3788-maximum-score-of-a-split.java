class Solution {
    public long maximumScore(int[] nums) {
        long prefixArray[] = new long [nums.length];
        int suffixMinArray[] = new int[nums.length];
        long sum = 0;
        int suffixMin = Integer.MAX_VALUE;
        long maxScore = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefixArray[i] = sum;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            suffixMinArray[i] = suffixMin;
            suffixMin = Math.min(suffixMin, nums[i]);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            long score = prefixArray[i] - suffixMinArray[i];
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
}
// 10 9 12 8 3
// -5 -5 -5 -5 -5

// 15 14 17 13 8
