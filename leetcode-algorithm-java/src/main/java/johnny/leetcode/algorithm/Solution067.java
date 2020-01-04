package johnny.leetcode.algorithm;

/**
 * Add Binary.
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 *
 * @author Johnny
 */
public class Solution067 {
    public String addBinary(String a, String b) {
        char[] nums1 = a.toCharArray();
        char[] nums2 = b.toCharArray();
        int i = nums1.length - 1;
        int j = nums2.length - 1;
        int carry = 0;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int c1 = (i >= 0) ? nums1[i] - '0' : 0;
            int c2 = (j >= 0) ? nums2[j] - '0' : 0;
            sum = c1 + c2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }

        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
