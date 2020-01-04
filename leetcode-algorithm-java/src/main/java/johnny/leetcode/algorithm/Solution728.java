package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. Self Dividing Numbers
 * A self-dividing number is a number that is divisible by every digit it contains.
 * <p>
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * <p>
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * <p>
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 * <p>
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * Note:
 * <p>
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 *
 * @author Johnny
 */
public class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            int num = i;
            while (num > 0) {
                int last = num % 10;
                if (last == 0) {
                    break;
                }
                if (i % last != 0) {
                    break;
                }
                num = num / 10;
            }
            if (num == 0) {
                ans.add(i);
            }
        }

        return ans;
    }
}
