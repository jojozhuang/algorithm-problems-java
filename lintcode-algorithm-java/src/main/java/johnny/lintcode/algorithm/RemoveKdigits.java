package johnny.lintcode.algorithm;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Remove Dights
 * Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
 * <p>
 * Example
 * Example 1:
 * <p>
 * Input: num = "1432219", k = 3
 * Output: "1219"
 * Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
 * Example 2:
 * <p>
 * Input: num = "10200", k = 1
 * Output: "200"
 * Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
 * Example 3:
 * <p>
 * Input: num = "10", k = 2
 * Output: "0"
 * Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 *
 * @author Johnny
 */
public class RemoveKdigits {
    /**
     * @param num: a number
     * @param k:   the k digits
     * @return: the smallest number
     */
    public String removeKdigits(String num, int k) {
        if (num == null || num.isEmpty()) {
            return num;
        }

        if (k >= num.length()) {
            return "0";
        }

        int removed = 0;
        Deque<Integer> deque = new LinkedList<>();
        int i = 0;
        for (; i < num.length() && removed < k; i++) {
            int digit = num.charAt(i) - '0';
            if (deque.isEmpty()) {
                deque.addLast(digit);
            } else {
                if (digit >= deque.peekLast()) {
                    deque.addLast(digit);
                } else {
                    while (!deque.isEmpty() && deque.peekLast() > digit) {
                        deque.pollLast();
                        removed++;
                        if (removed >= k) {
                            break;
                        }
                    }
                    deque.addLast(digit);
                }
            }
        }

        while (!deque.isEmpty() && removed < k) {
            deque.pollLast();
            removed++;
        }
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        while (!deque.isEmpty()) {
            int n = deque.pollFirst();
            if(leadingZero && n == 0) {
                continue;
            }
            leadingZero = false;
            sb.append(n);
        }

        String ans = sb.toString() + num.substring(i);
        if (ans.length() == 0) {
            return "0";
        }

        return ans;
    }
}
