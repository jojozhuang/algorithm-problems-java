package johnny.leetcode.algorithm;

/**
 * 1009. Complement of Base 10 Integer
 * Every non-negative integer N has a binary representation.  For example, 5 can be represented as "101" in binary, 11 as "1011" in binary, and so on.  Note that except for N = 0, there are no leading zeroes in any binary representation.
 * <p>
 * The complement of a binary representation is the number in binary you get when changing every 1 to a 0 and 0 to a 1.  For example, the complement of "101" in binary is "010" in binary.
 * <p>
 * For a given number N in base-10, return the complement of it's binary representation as a base-10 integer.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 5
 * Output: 2
 * Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
 * Example 2:
 * <p>
 * Input: 7
 * Output: 0
 * Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
 * Example 3:
 * <p>
 * Input: 10
 * Output: 5
 * Explanation: 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.
 * <p>
 * <p>
 * Note:
 * <p>
 * 0 <= N < 10^9
 *
 * @author Johnny
 */
public class SolutionA1009 {
    public int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }
        int temp = N;
        int count = 0;
        while (N > 0) {
            N = N >> 1;
            count++;
        }
        int mask = 1;
        for (int i = 0; i < count; i++) {
            mask = mask << 1;
        }
        mask = mask - 1;
        return mask ^ temp;
    }
}
