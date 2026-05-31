class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int ans= digitSum(nums[i]);
            min= Math.min(min,ans);
        }
        return min;
    }
    public static int digitSum(int n) {
    int sum = 0;
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}
}