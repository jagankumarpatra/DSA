class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0; // Stores the position of the next available zero
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap nonzero element with the first found zero
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++; // Move the zero index forward
            }
        }
    }
}