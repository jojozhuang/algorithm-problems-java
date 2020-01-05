package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 842. Split Array into Fibonacci Sequence
 * <p>
 * Given a string S of digits, such as S = "123456579", we can split it into a Fibonacci-like sequence [123, 456, 579].
 * <p>
 * Formally, a Fibonacci-like sequence is a list F of non-negative integers such that:
 * {@code 0 <= F[i] <= 2^31 - 1}, (that is, each integer fits a 32-bit signed integer type;}
 * {@code F.length >= 3;}
 * {@code and F[i] + F[i+1] = F[i+2] for all 0 <= i < F.length - 2.}
 * Also, note that when splitting the string into pieces, each piece must not have extra leading zeroes, except if the piece is the number 0 itself.
 * <p>
 * Return any Fibonacci-like sequence split from S, or return [] if it cannot be done.
 * <p>
 * Example 1:
 * Input: "123456579"
 * Output: [123,456,579]
 * <p>
 * Example 2:
 * Input: "11235813"
 * Output: [1,1,2,3,5,8,13]
 * <p>
 * Example 3:
 * Input: "112358130"
 * Output: []
 * Explanation: The task is impossible.
 * <p>
 * Example 4:
 * Input: "0123"
 * Output: []
 * Explanation: Leading zeroes are not allowed, so "01", "2", "3" is not valid.
 * <p>
 * Example 5:
 * Input: "1101111"
 * Output: [110, 1, 111]
 * Explanation: The output [11, 0, 11, 11] would also be accepted.
 * <p>
 * Note:
 * {@code 1 <= S.length <= 200}
 * S contains only digits.
 *
 * @author Johnny
 */
public class Solution842 {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> res = new ArrayList<>();
        if (S == null || S.length() < 3) {
            return res;
        }

        int len = S.length();
        for (int offset = 1; offset < len; offset++) {
            if (!isValid(S.substring(0, offset))) {
                continue;
            }
            for (int offset2 = 1; offset + offset2 < len; offset2++) {
                if (!isValid(S.substring(offset, offset + offset2))) {
                    continue;
                }
                res.clear();
                int first = Integer.parseInt(S.substring(0, offset));
                res.add(first);
                int second = Integer.parseInt(S.substring(offset, offset + offset2));
                res.add(second);
                boolean finish = helper(first, second, S, offset + offset2, res);
                if (finish && res.size() >= 3) {
                    return res;
                }
            }
        }

        res.clear();
        return res;
    }

    private boolean helper(int first, int second, String S, int pos, List<Integer> list) {
        if (pos > S.length()) {
            list.clear();
            return false;
        }

        int sum = first + second;
        String sumStr = "" + sum;
        if (pos + sumStr.length() > S.length()) {
            list.clear();
            return false;
        }

        for (int offset = sumStr.length(); offset <= 10 && offset <= S.length() - sumStr.length(); offset++) {
            if (pos + offset <= S.length()) {
                if (!isValid(S.substring(pos, pos + offset))) {
                    continue;
                }
                int third = Integer.parseInt(S.substring(pos, pos + offset));
                if (sum == third) {
                    list.add((int) third);
                    if (pos + offset == S.length()) {
                        return true;
                    } else {
                        boolean finished = helper(second, third, S, pos + offset, list);
                        if (finished) {
                            return true;
                        }
                    }
                } else {
                    list.clear();
                    return false;
                }
            } else {
                list.clear();
                return false;
            }
        }

        return false;
    }

    private boolean isValid(String str) {
        if (str.startsWith("0") && str.length() > 1) {
            return false;
        }

        String max = "" + Integer.MAX_VALUE;
        if (str.length() > max.length()) {
            return false;
        } else if (str.length() == max.length()) {
            long num = Long.parseLong(str);
            if (num > Integer.MAX_VALUE) {
                return false;
            }
        }

        return true;
    }
}
