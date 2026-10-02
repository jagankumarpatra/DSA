class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>e:hm.entrySet()){
            // int x=n/2;
            if(e.getValue()>n/2){
                return e.getKey();
            }
        }
        return -1;
    }
    // char upper = Character.toUpperCase(lower); // Result: 'A'

}


// int n=nums.length;
//         HashMap<Integer,Integer>hm=new HashMap<>();
//         for(int i:nums){
//             hm.put(i,hm.getOrDefault(i,0)+1);
//         }
//         for(Map.Entry<Integer,Integer>e:hm.entrySet()){
//             int x=n/2;
//             if(e.getValue()>x)
//                 return e.getKey();
//         }
//         return -1;