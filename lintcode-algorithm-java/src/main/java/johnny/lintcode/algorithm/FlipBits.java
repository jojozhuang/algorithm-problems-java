package johnny.lintcode.algorithm;

/**
 * Convert Integer A to Integer B.
 * Determine the number of bits required to convert integer A to integer B
 * Example
 * Given n = 31, m = 14,return 2
 * <p>
 * (31)10=(11111)2
 * <p>
 * (14)10=(01110)2
 *
 * @author Johnny
 */
public class FlipBits {
    public static int bitSwapRequired(int a, int b) {
        int count = 0;
        int xor = a ^ b;
        while (xor != 0) {
            ++count;
            xor &= xor - 1;
        }

        return count;
    }
}
