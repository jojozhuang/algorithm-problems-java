package johnny.lintcode.algorithm;

/**
 * Count 1 in Binary.
 * <p>
 * Count how many 1 in binary representation of a 32-bit integer.
 * <p>
 * Example
 * Given 32, return 1
 * <p>
 * Given 5, return 2
 * <p>
 * Given 1023, return 10
 * <p>
 * Challenge
 * If the integer is n bits with m 1 bits. Can you do it in O(m) time?
 *
 * @author Johnny
 */
public class Count1inBinary {
    public int countOnes(int num) {
        if (num >= 0) {
            int count = 0;
            while (num != 0) {
                num = num & (num - 1);
                count++;
            }
            return count;
        } else {
            int count = 0;
            while (num != -1) {
                num = num | (num + 1);
                count++;
            }
            return 32 - count;
        }
    }
}
