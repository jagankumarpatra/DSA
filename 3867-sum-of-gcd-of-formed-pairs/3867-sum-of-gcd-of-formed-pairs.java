class Solution {
    public long gcdSum(int[] nums) {
        int n= nums.length;
        int mx1[]=new int [n];
        mx1[0]=nums[0];
        for(int i=1;i<n;i++){
            mx1[i]=Math.max(nums[i],mx1[i-1]);
        }
        int prefixGcd[]=new int[n];
        for(int i=0;i<n;i++){
            prefixGcd[i]=gcd(nums[i],mx1[i]);
        }
        Arrays.sort(prefixGcd);
        long sum=0;
        int k=0,l=n-1;
     
        while(k<l){
            sum+= gcd(prefixGcd[k],prefixGcd[l]);
            k++;
            l--;
        }
        return sum;

    }
    public int gcd(int a, int b){
            if (b == 0) return a;
            return gcd(b, a % b);
    }
}