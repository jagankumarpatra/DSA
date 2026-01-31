class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        for(int i=0;i<n;i++){
            int val1=(int)target;
            int val2=(int)letters[i];
            if(val2>val1){
                return letters[i];
            }
        }
        return letters[0];

    }
}
