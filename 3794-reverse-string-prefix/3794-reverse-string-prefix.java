class Solution {
    public String reversePrefix(String s, int k) {
        String abs="";
        for(int i=0;i<k;i++){
            abs+=s.charAt(i);
        }
        String res1=rev(abs);
        for(int i=k;i<s.length();i++){
            res1+=s.charAt(i);
        }
        return res1;
    }
    private String rev(String str){
          String r = "";
          for(int i=0;i<str.length();i++){
            r=str.charAt(i)+r;
          }
          return r;
    }
}