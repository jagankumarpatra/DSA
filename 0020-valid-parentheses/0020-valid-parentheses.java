class Solution {
    public static boolean matching(char a,char b)
    {
        return (( a=='(' && b==')' )||( a=='[' && b==']' )||( a=='{' && b=='}' ));
    }
    public boolean isValid(String x) {
         Stack<Character> s = new Stack<>();
        for(int i=0;i<x.length();i++)
        {
            char c=x.charAt(i); 
            if(c=='(' || c=='[' || c=='{')
                s.push(c);
            else
            {
                if(s.isEmpty())
                    return false;
                else if(matching(s.peek(),c)==false)
                    return false;
                else

                    s.pop();
            }
        }
        return(s.isEmpty());
    }
}