class Solution {
    public String trimTrailingVowels(String s) {
         if (s == null || s.length() == 0) return s;

for(int i=s.length()-1;i>=0;i--){
    char last = s.charAt(i);
      if (!isVowel(last)) {
        return s.substring(0, i+1);
    }
}



return "";
    }

private boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}
}