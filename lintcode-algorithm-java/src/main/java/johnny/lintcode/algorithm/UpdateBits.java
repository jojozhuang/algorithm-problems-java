package johnny.lintcode.algorithm;

/**
 * Update Bits.
 * Given two 32-bit numbers, N and M, and two bit positions, i and j.
 * Write a method to set all bits between i and j in N equal to M
 * (e g , M becomes a substring of N located at i and starting at j)
 * <p>
 * Example
 * Given N=(10000000000)2, M=(10101)2, i=2, j=6
 * return N=(10001010100)2
 * <p>
 * Note
 * In the function, the numbers N and M will given in decimal, you should also return a decimal number.
 * <p>
 * Challenge
 * Minimum number of operations?
 * <p>
 * Clarification
 * You can assume that the bits j through i have enough space to fit all of M.
 * That is, if M=10011， you can assume that there are at least 5 bits between j
 * and i. You would not, for example, have j=3 and i=2, because M could not
 * fully fit between bit 3 and bit 2.
 *
 * @author Johnny
 */
public class UpdateBits {
    /*
    1. 11110000000 (left, all 1 << j + 1)
    2. 00000000011 (right, i << 1 - 1)
    3. 11110000011 (mask, left | right)
    4. 00001001100 (m << i)
    5. 10000000000 (n & mask)
    6. 10001001100 (n & mask | m << i)
    */
    public int updateBits(int n, int m, int i, int j) {
        int allone = ~0;

        int mask = 0;
        if (j < 31) {
            int left = allone << (j + 1);
            int right = (1 << i) - 1;
            mask = left | right;
        } else {
            mask = (1 << i) - 1; //no left
        }

        return (n & mask) | (m << i);
    }
}
