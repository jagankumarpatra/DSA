class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] == 1 && nums[j] == 2) {
                  
                        ans = Math.min(Math.abs(j - i), ans);
                    
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}