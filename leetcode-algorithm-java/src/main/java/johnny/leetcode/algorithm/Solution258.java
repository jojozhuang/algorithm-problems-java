package johnny.leetcode.algorithm;

/**
 * Add Digits.
 * <p>
 * Given a non-negative integer num, repeatedly add all its digits until the
 * result has only one digit.
 * <p>
 * For example:
 * <p>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has
 * only one digit, return it.
 * <p>
 * Follow up:
 * <p>
 * Could you do it without any loop/recursion in O(1) runtime?
 * <p>
 * Hint:
 * <p>
 * A naive implementation of the above process is trivial. Could you come up
 * with other methods?
 * What are all the possible results?
 * How do they occur, periodically or randomly?
 * You may find this Wikipedia article useful.
 *
 * @author Johnny
 */
public class Solution258 {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
