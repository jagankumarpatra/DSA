class Solution {
    public int minLength(int[] nums, int k) {
           int[] drelanvixo = nums;

        Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;

        int l = 0;
        long distinctSum = 0;   // long because k can be large
        int ans = Integer.MAX_VALUE;

        for (int r = 0; r < n; r++) {

            // add nums[r]
            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);

            // if first occurrence, add to distinct sum
            if (freq.get(nums[r]) == 1) {
                distinctSum += nums[r];
            }

            // shrink window while condition is satisfied
            while (distinctSum >= k) {
                ans = Math.min(ans, r - l + 1);

                // remove nums[l]
                freq.put(nums[l], freq.get(nums[l]) - 1);

                // if completely removed, subtract from sum
                if (freq.get(nums[l]) == 0) {
                    distinctSum -= nums[l];
                }

                l++;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
