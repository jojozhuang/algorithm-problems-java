package johnny.leetcode.algorithm;

/**
 * Plus One.
 * Given a non-negative number represented as an array of digits, plus one to
 * the number.
 * The digits are stored such that the most significant digit is at the head
 * of the list.
 *
 * @author Johnny
 */
public class Solution066 {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return null;
        }
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }

    public int[] plusOne2(int[] digits) {
        if (digits == null || digits.length == 0) {
            return null;
        }

        int carry = 0;
        int sum = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                sum = digits[i] + 1 + carry;
            } else {
                sum = digits[i] + carry;
            }

            if (sum >= 10) {
                carry = 1;
                digits[i] = sum - 10;
            } else {
                digits[i] = sum;
                return digits;
            }
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;
        /*for (int i = 1; i < ret.length; i++) {
            ret[i] = 0;
        }*/

        return res;
    }
}
