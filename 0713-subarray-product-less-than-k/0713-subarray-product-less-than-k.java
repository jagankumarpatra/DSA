class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         int count = 0;
        int length = nums.length; 

        for(int i=0; i<length; i++)
        {
            int product = nums[i]; 
            if(product >= k)
                continue;
            count++;
            for(int j=i+1; j<length; j++)
            {
                product*= nums[j];
                // if greater than
                if(product >= k)
                    break;
                count++;
            }
        }
        return count;
    }
}