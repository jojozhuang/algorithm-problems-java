package johnny.leetcode.algorithm;

/**
 * Add Strings
 * 
 * Given two non-negative integers num1 and num2 represented as string, return 
 * the sum of num1 and num2.
 * 
 * Note:
 * 
 * 1. The length of both num1 and num2 is < 5100.
 * 2. Both num1 and num2 contains only digits 0-9.
 * 3. Both num1 and num2 does not contain any leading zero.
 * 4. You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * 
 * @author Johnny
 */
public class Solution415 {
    public String addStrings(String num1, String num2) {
        if (num1 == null || num1.length() == 0) {
            return num2;
        }
        if (num2 == null || num2.length() == 0) {
            return num1;
        }
        
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int v1 = (i < 0) ? 0 : num1.charAt(i) - '0';
            int v2 = (j < 0) ? 0 : num2.charAt(j) - '0';
            int sum = v1 + v2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
}
