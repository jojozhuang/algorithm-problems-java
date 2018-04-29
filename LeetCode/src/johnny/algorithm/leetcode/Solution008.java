package johnny.algorithm.leetcode;

/**
 * Implement atoi to convert a string to an integer.
 * Hint: Carefully consider all possible input cases. If you want a challenge, 
 *   please do not see below and ask yourself what are the possible input cases.
 * Notes: It is intended for this problem to be specified vaguely (ie, 
 *   no given input specs). You are responsible to gather all the input 
 *   requirements up front.
 * 
 * int: [-2147483648, 2147483647]
 * 
 * @author Johnny
 */
public class Solution008 {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0 || str.trim().length() == 0) {
            return 0;
        }
 
        str = str.trim();
        int sign = 1;
        int i = 0;
        if (str.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        
        long result = 0;
        while (i < str.length()) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                break;
            }
            char ch = str.charAt(i);
            if (ch <= '9' && ch >= '0') {
                result = result * 10 + sign * (ch - '0');
                // overflow
                if (result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (result < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
            i++;
        }
        
        return (int)(result);
    }
}
