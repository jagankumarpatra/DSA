class Solution {
    public int bitwiseComplement(int n) {
        String res = "";
        String binaryNumber = Integer.toBinaryString(n);
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) == '1') {
                res += 0;
            } else {
                res += 1;
            }
        }
        return Integer.parseInt(res, 2);
    }
}