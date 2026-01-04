class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans =ans+ divi(nums[i]);
        }
        return ans;
    }

    private int divi(int no) {
        int sum = 0;
        int cnt = 0;
        for (int i = 1; i <= no; i++) {
            if (no % i == 0) {
                sum+=i;
                cnt++;
                if(cnt>4){
                    return 0;
                }
            }
        }
        return cnt==4 ? sum: 0;
    }
}