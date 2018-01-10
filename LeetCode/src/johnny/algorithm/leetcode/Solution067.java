package johnny.algorithm.leetcode;

/**
 * Add Binary.
 * Given two binary strings, return their sum (also a binary string).
 * 
 * For example,
 *  a = "11"
 *  b = "1"
 *  Return "100".
 * 
 * @author Johnny
 */
public class Solution067 {
    public String addBinary(String a, String b) {
        if (a == null || a.isEmpty()) {
            return b;
        }
        if (b == null || b.isEmpty()) {
            return a;
        }
        
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(i >= 0 || j >= 0) {
            int val1 = (i < 0) ? 0 : arr1[i] - '0';
            int val2 = (j < 0) ? 0 : arr2[j] - '0';
            int sum = val1 + val2 + carry;
            int curr = sum % 2;
            carry = sum >= 2 ? 1 : 0;
            sb.append(curr);
            i--;
            j--;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        
        sb.reverse();
        
        return sb.toString();
    }   
}
