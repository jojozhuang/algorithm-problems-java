package johnny.leetcode.algorithm;

/**
 * Number of 1 Bits.
 * <p>
 * Write a function that takes an unsigned integer and returns the number of ’1'
 * bits it has (also known as the Hamming weight).
 * <p>
 * For example, the 32-bit integer ’11' has binary representation
 * 00000000000000000000000000001011, so the function should return 3.
 *
 * @author Johnny
 */
public class Solution191 {
    /*
 2147483647 = 011111111111111111111111111111111
          3 = 000000000000000000000000000000011
          2 = 000000000000000000000000000000010
          1 = 000000000000000000000000000000001
          0 = 000000000000000000000000000000000
         -1 = 111111111111111111111111111111111
         -2 = 111111111111111111111111111111110
         -3 = 111111111111111111111111111111101
-2147483647 = 100000000000000000000000000000001
-2147483648 = 100000000000000000000000000000000
     */
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                ans++;
            }
            n = n >>> 1;
        }
        return ans;
    }

    public int hammingWeight2(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >>> i) & 1) == 1) {
                count++;
            }
        }

        return count;
    }
}
