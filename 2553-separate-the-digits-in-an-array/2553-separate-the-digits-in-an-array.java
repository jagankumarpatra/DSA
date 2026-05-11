class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String s = Integer.toString(nums[i]);
            for(char j: s.toCharArray()){
                digits.add(Character.getNumericValue(j));
            }
        }
        int n = digits.size();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=digits.get(i);
        }
        return arr;

    }
}