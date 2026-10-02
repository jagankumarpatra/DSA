class Solution {
    public int removeElement(int[] nums, int val) {
        int n=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[n]=nums[i];
                n++;
                cnt++;
            }
        }
        return cnt;
    }
}