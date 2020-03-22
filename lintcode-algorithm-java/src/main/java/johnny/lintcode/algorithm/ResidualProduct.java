package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Residual Product
 *
 * Input is an integer array arr. Please return the result array ans so that ans[i] is the product of all the
 * numbers except arr[i] in arr.
 *
 * 1 <= arr.length <= 10
 * -10 <= arr[i] <= 10

 * Example
 * Example1
 * Input: arr = [2,3,4,1]
 * Output: [12,8,6,24]
 * Explanation:
 * 3 * 4 * 1 = 12, 2 * 4 * 1 = 8, 2 * 3 * 1= 6, 2 * 3 * 4 = 24
 *
 * Example2
 * Input: arr = [1,2]
 * Output: [2,1]
 * Explanation:
 * 2 = 2, 1 = 1。
 *
 */
public class ResidualProduct {
    public int[] getProduct(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[]{};
        }
        int n = arr.length;

        int[] ans = new int[n];
        if (n == 1) {
            return ans;
        }

        int zero = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero++;
                index = i;
            }
            if (zero >= 2) {
                break;
            }
        }

        if (zero >= 2) {
            return ans;
        }

        if (zero == 1) {
            int mul = 1;
            for (int i = 0; i < index; i++) {
                mul *= arr[i];
            }
            for (int i = index + 1; i < n; i++) {
                mul *= arr[i];
            }
            ans[index] = mul;
            return ans;
        }

        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        int[] right = new int[n];
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}
