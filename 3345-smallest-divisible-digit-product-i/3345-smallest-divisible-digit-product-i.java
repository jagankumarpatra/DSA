class Solution {

    public int smallestNumber(int n, int t) {
        while(true){
          int x=  prod(n);
          if(x%t==0){
            return n;
          }
          else{
            n++;
          }
        }
    }
     private int prod(int n) {
            int val=1;
            while(n>0){
int c=n%10;
val*=c;
n=n/10;
            }

return val;
    }
}

