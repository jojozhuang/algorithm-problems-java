package johnny.leetcode.algorithm;

import java.util.Stack;

/**
 * Remove K Digits
 * <p>
 * Given a non-negative integer num represented as a string, remove k digits from
 * the number so that the new number is the smallest possible.
 * <p>
 * Note:
 * The length of num is less than 10002 and will be ≥ k.
 * The given num does not contain any leading zero.
 * <p>
 * Example 1:
 * Input: num = "1432219", k = 3
 * Output: "1219"
 * Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219
 * which is the smallest.
 * <p>
 * Example 2:
 * Input: num = "10200", k = 1
 * Output: "200"
 * Explanation: Remove the leading 1 and the number is 200. Note that the output
 * must not contain leading zeroes.
 * <p>
 * Example 3:
 * Input: num = "10", k = 2
 * Output: "0"
 * Explanation: Remove all the digits from the number and it is left with
 * nothing  which is 0.
 *
 * @author Johnny
 */
public class Solution402 {
    public String removeKdigits(String num, int k) {
        if (num == null || num.length() == 0 || num.length() <= k) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();
        int i = 0;
        int j = 0;
        for (; i < num.length(); i++) {
            char c = num.charAt(i);
            if (stack.isEmpty() || c >= stack.peek()) {
                stack.push(c);
                continue;
            }

            while (j < k && !stack.isEmpty() && c < stack.peek()) {
                stack.pop();
                j++;
            }
            stack.push(c);
            if (j == k) {
                break;
            }
        }

        if (j < k) {
            while (j < k && !stack.isEmpty()) {
                stack.pop();
                j++;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        String res = sb.reverse().toString();
        if (i < num.length()) {
            res = res + num.substring(i+1);
        }

        res = leadingZero(res);
        if (res == "") {
            res = "0";
        }

        return res;
    }

    private String leadingZero(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.charAt(0) != '0') {
            return str;
        }

        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                break;
            }
        }

        if (i == str.length()) {
            return "";
        }

        return str.substring(i);
    }

    public String removeKdigits3(String num, int k) {
        if (num == null || num.isEmpty() || k < 0 || k >= num.length()) {
            return "0";
        }
        int len = num.length();
        //corner case
        if (k == len)
            return "0";

        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < num.length()) {
            //whenever meet a digit which is less than the previous digit, discard the previous one
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }

        // corner case like "1111"
        while (k > 0) {
            stack.pop();
            k--;
        }

        //construct the number from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();

        //remove all the 0 at the head
        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        return sb.toString();
    }

    public String removeKdigits2(String num, int k) {
        if (num == null || num.isEmpty() || k < 0 || k >= num.length()) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();
        stack.push(num.charAt(0));
        int i = 1;
        while (i < num.length() && k > 0) {
            char ch = num.charAt(i);
            if (stack.peek() <= ch) {
                stack.push(ch);
                i++;
            } else {
                while (!stack.isEmpty() && stack.peek() > ch && k > 0) {
                    stack.pop();
                    k--;
                }
                stack.push(ch);
                i++;
                if (k == 0) {
                    break;
                }
            }
        }

        String res = "";
        StringBuilder sb = new StringBuilder();
        if (k == 0) {
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            res = sb.reverse().toString();
            if (i < num.length()) {
                res += num.substring(i);
            }
        } else {
            while (!stack.isEmpty() && k > 0) {
                stack.pop();
                k--;
            }
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            res = sb.reverse().toString();
        }

        if (res.startsWith("0")) {
            int j = 0;
            while (j < res.length()) {
                if (res.charAt(j) == '0') {
                    j++;
                } else {
                    break;
                }
            }
            res = res.substring(j);
        }

        if (res.isEmpty()) {
            res = "0";
        }

        return res;
    }
}
