class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toString();
        StringBuilder res = new StringBuilder(result);
        String data= res.reverse().toString().toLowerCase();
        if(result.equals(data)){
            return true;
        }
        return false;
    }
}
// amanaplanacanalpanama