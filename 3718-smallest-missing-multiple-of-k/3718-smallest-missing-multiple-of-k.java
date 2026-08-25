class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>hs=new HashSet<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int i =1;
        while(true){
            // int kes=k;
            int ans = i*k;
            if(!hs.contains(ans)){
                return ans;
            }
            i++;
        }
    }
        //  return res;
}