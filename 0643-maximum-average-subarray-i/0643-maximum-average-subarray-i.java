class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = Integer.MIN_VALUE;
        int n = nums.length;
        int i=0, j = 0;
        double sum=0;
        while(i<k){
            sum=sum+nums[i];
            i++; 
        }
        while(j<n ){
            double val = sum/k;
            avg = Math.max(avg, val);
            if(i<n){
            sum =sum- nums[j];
            sum= sum+nums[i];
            }
            j++;
            i++;
        }
        return avg;
    }
}