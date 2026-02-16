import java.math.BigInteger;

class Solution {
    public int reverseBits(int n) {
        // 1. Convert the integer to a binary string
        // We use Integer.toBinaryString because it handles the bits directly
        String binaryString = Integer.toBinaryString(n);

        // 2. IMPORTANT: Pad with leading zeros to reach 32 bits
        // If we don't pad, the "reverse" won't account for the full 32-bit slot
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32 - binaryString.length(); i++) {
            sb.append('0');
        }
        sb.append(binaryString);

        // 3. Reverse the string
        String reversed = sb.reverse().toString();

        // 4. Convert back to an integer
        // Use parseLong then cast to int to handle unsigned 32-bit values safely
        return (int) Long.parseLong(reversed, 2);
    }
}
