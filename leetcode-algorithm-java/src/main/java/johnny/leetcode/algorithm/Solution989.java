package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 989. Add to Array-Form of Integer
 * For a non-negative integer X, the array-form of X is an array of its digits in left to right order.  For example, if X = 1231, then the array form is [1,2,3,1].
 * <p>
 * Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.
 * <p>
 * Example 1:
 * Input: A = [1,2,0,0], K = 34
 * Output: [1,2,3,4]
 * Explanation: 1200 + 34 = 1234
 * <p>
 * Example 2:
 * Input: A = [2,7,4], K = 181
 * Output: [4,5,5]
 * Explanation: 274 + 181 = 455
 * <p>
 * Example 3:
 * Input: A = [2,1,5], K = 806
 * Output: [1,0,2,1]
 * Explanation: 215 + 806 = 1021
 * <p>
 * Example 4:
 * Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
 * Output: [1,0,0,0,0,0,0,0,0,0,0]
 * Explanation: 9999999999 + 1 = 10000000000
 *
 * @author Johnny
 */
public class Solution989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ans = new ArrayList<>();
        int carry = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            int num = K % 10;
            int sum = A[i] + num + carry;
            carry = sum / 10;
            ans.add(0, sum % 10);
            K = K / 10;
        }
        while (K > 0) {
            int num = K % 10;
            int sum = num + carry;
            carry = sum / 10;
            ans.add(0, sum % 10);
            K = K / 10;
        }
        if (carry != 0) {
            ans.add(0, carry);
        }

        return ans;
    }
}
