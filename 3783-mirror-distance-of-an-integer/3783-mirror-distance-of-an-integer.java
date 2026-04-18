class Solution {
    public int mirrorDistance(int n) {
        int rev=reverse(n);
        return Math.abs(n-rev);
    }
    private int reverse (int no){
          int result = 0;
        while (no != 0) {
            result = result * 10 + no % 10;
            no /= 10;
        }
        return result;
    }
}