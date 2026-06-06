class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int answer[]=new int[nums.length];
        int leftSum[]=new int[nums.length];
        int rightSum[]=new int[nums.length];
        int l=0;
        for(int i=0;i<nums.length;i++){
            leftSum[i]=l;
            l+=nums[i];
        }
        int r=0;
        for(int i=nums.length-1;i>=0;i--){
            rightSum[i]=r;
            r+=nums[i];
        }
        for(int i=0;i<answer.length;i++){
            answer[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return answer;
    }
}