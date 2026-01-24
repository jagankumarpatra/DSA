class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum=Integer.MIN_VALUE;
        int i=0;
        int j=n-1;
        while(i<j){
            int val=nums[i]+nums[j];
            sum=Math.max(val,sum);
            i++;
            j--;
        }
        return sum;
    }
}
// 2 3 3 5

// 2 3 4 4 5 6