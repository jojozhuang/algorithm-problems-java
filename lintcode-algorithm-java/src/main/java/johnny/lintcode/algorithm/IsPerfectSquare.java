package johnny.lintcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Valid Perfect Square
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * Example
 * Example1:
 * Input: num = 16
 * Output: True
 * Explanation:
 * sqrt(16) = 4
 *
 * Example2:
 * Input: num = 15
 * Output: False
 * Explanation:
 * sqrt(15) = 3.87
 *
 * @author Johnny
 */
public class IsPerfectSquare {
    /**
     * @param num: a positive integer
     * @return: if num is a perfect square else False
     */
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long mul = mid * mid;
            if (mul == num) {
                return true;
            } else if (mul < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
