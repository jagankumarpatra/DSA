class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        // Arrays.sort(nums);
        // List<List<Integer>>res=new LinkedList<>();
        // for(int i=0;i<nums.length-2;i++)
        // {
        //     if(i==0||(i>0 && nums[i]!=nums[i-1])){
        //         int low=i+1,high=nums.length-1,sum=0-nums[i];
        //         while(low<high){
        //             if(nums[low]+nums[high]==sum){
        //                 res.add(Arrays.asList(nums[i],nums[low],nums[high]));
        //                 while(low<high && nums[low]==nums[low++]) low++;
        //                 while(low<high && nums[high]==nums[high++]) high--;
        //                 low++;
        //                 high--;
        //             }
        //             else if(nums[low]+nums[high]<sum)
        //                 low++;
        //             else
        //                 high--;
        //         }
        //     }
        // }
        // return res;
        Arrays.sort(num);
        
        List<List<Integer>> res = new LinkedList<>(); 
        
        for (int i = 0; i < num.length-2; i++) {
            
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        
                        lo++; hi--;
                    } 
                    else if (num[lo] + num[hi] < sum) lo++;
                    
                    else hi--;
               }
            }
        }
        return res;
    }
}