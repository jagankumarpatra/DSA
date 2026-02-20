class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String,Integer>hm=new HashMap<>();
        for(String word: words){
            if(word.length()<k) continue;
            String res= word.substring(0,k);
            hm.put(res, hm.getOrDefault(res,0)+1);
        }
        int cnt=0;
        for(int cn:hm.values()){
            if(cn>=2){
                cnt++;
            }
        }
        return cnt;
    }
}