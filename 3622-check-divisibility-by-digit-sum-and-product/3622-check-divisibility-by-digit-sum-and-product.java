class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,mul=1;
        int nimbu=n;
        while(n>0){
            int x= n%10;
            sum+=x;
            mul*=x;
            n=n/10;
        }
        int ans = sum+mul;
        return nimbu%ans !=0 ? false: true;
    }
}