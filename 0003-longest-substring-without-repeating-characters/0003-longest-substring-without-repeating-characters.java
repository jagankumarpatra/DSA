 class Solution {
    public int lengthOfLongestSubstring(String s) {
       int cnt=0;
       int i=0;
       int rem=0;
       HashSet<Character>hs=new HashSet<>();
       while(i<s.length()){
           if(!hs.contains(s.charAt(i))){
               hs.add(s.charAt(i));
               i++;
               cnt=Math.max(cnt,hs.size());
           }
           else{
               hs.remove(s.charAt(rem));
               rem++;
           }
       }
       return cnt;
    }
}
