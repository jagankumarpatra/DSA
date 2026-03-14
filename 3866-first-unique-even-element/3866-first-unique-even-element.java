class Solution {
    public int firstUniqueEven(int[] nums) {
          int n=nums.length;
        HashMap<Integer,Integer>hm=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>e:hm.entrySet()){
            // int x=n/2;
            if(e.getValue()==1 && e.getKey()%2==0){
                return e.getKey();
            }
        }
        return -1;
    }
}