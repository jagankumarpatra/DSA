class Solution {
    public int minimumDifference(int[] nums, int k) {
        int val=k-1;
        int n=nums.length;
        int i=0, j= val;
        int ans=Integer.MAX_VALUE;
        if(k==1) return 0;
        Arrays.sort(nums);
        while(i<j && j<n){
            ans=Math.min(ans,nums[j]-nums[i]);
            i++;
            j++;
        }
        return ans;
    }
}