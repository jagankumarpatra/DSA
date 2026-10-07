class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j =i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[j]+nums[k];
                int res = 0-nums[i];
                if(sum>res){
                    k--;
                }
                else if(sum<res){
                    j++;
                }
                else {
                    ls.add(   Arrays.asList(nums[i], nums[j], nums[k]));
                     while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                }

            }
        }
        return ls;
    }
}