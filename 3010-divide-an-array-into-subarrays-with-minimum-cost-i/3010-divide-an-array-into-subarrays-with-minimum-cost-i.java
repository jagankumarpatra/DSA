class Solution {
    public int minimumCost(int[] nums) {
        int no1=nums[0];
        int n= nums.length-1;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i+1];
        }

        Arrays.sort(arr);
        return no1+arr[0]+arr[1];
    }
}
