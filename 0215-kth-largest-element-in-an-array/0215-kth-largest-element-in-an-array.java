class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int res=n-k;
        return nums[res];
    }
}
// n 6
// k 2
// 4

// 1 2 3 4 5 6
