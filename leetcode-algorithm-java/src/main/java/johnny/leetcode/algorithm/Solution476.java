package johnny.leetcode.algorithm;

/**
 * Number Complement
 * <p>
 * Given a positive integer, output its complement number. The complement
 * strategy is to flip the bits of its binary representation.
 * <p>
 * Note:
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * <p>
 * You could assume no leading zero bit in the integer’s binary representation.
 * Example 1:
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits),
 * and its complement is 010. So you need to output 2.
 * <p>
 * Example 2:
 * Input: 1
 * Output: 0
 * Explanation: The binary representation of 1 is 1 (no leading zero bits),
 * and its complement is 0. So you need to output 0.
 *
 * @author Johnny
 */
public class Solution476 {
    public int findComplement(int num) {
        int ans = 0;

        int i = 0;
        while (num > 0) {
            ans += ((num & 1) ^ 1) << i;
            num = num >> 1;
            i++;
        }

        return ans;
    }

    public int findComplement2(int num) {
        long pow = 1;
        while (pow <= num) {
            pow = pow << 1;
        }
        // eg. 16-1-8=7, 10000-1=1111->1111-1000=111
        return (int) (pow - 1 - num);
    }

    public int findComplement3(int num) {
        int highest = Integer.highestOneBit(num);
        int mask = highest - 1;
        num = ~num;
        return num & mask;
    }
}
