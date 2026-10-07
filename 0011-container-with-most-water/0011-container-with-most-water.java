class Solution {
    public int maxArea(int[] height) {
       int max = 0;
    int n = height.length;
    int i = 0, j = n - 1;
    
    while (i < j) {
        int minu = Math.min(height[i], height[j]);
        
        // FIX 1: Area = height * width
        int ans = minu * (j - i); 
        
        max = Math.max(max, ans);
        
        // FIX 2: Move the pointer with the smaller height
        if (height[i] < height[j]) {
            i++;
        } else {
            j--;
        }
    }
    return max;
    }
}