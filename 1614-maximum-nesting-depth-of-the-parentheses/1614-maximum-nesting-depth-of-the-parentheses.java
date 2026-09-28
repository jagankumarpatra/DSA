class Solution {
    public int maxDepth(String s) {
        int ans =0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ans+=1;
                max=Math.max(max,ans);
            }
            else  if(s.charAt(i)==')'){
                ans-=1;
                max=Math.max(max,ans);
            }
        }
        return max;
    }
    }