class Solution {
    public boolean containsDuplicate(int[] nums) {
          HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums)
            hm.put(x,hm.getOrDefault(x,0)+1);
        for(Map.Entry <Integer,Integer> e:hm.entrySet()){
            if(e.getValue()>=(2))
                return true;
        }
        return false;
    }
}