package johnny.leetcode.algorithm;

/**
 * Product of Array Except Self.
 * <p>
 * Given an array of n integers where {@code n > 1}, nums, return an array output such
 * that output[i] is equal to the product of all the elements of nums except nums[i].
 * <p>
 * Solve it without division and in O(n).
 * <p>
 * For example, given [1,2,3,4], return [24,12,8,6].
 * <p>
 * Follow up:
 * Could you solve it with constant space complexity? (Note: The output array
 * does not count as extra space for the purpose of space complexity analysis.)
 *
 * @author Johnny
 */
public class Solution238 {
    //http://blog.csdn.net/wzy_1988/article/details/46916179
    //nums=[a1, a2, a3, a4]
    //res=[a2*a3*a4, a1*a3*a4, a1*a2*a4, a2*a3*a4]
    //[1, a1, a1*a2, a1*a2*a3]
    //[a2*a3*a4, a3*a4, a4, 1]
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return new int[]{};
        }

        int n = nums.length;
        int[] ans = new int[n];
        // Calculate lefts and store in res.
        int left = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                left = left * nums[i - 1];
            }
            ans[i] = left;
        }
        // Calculate rights and the product from the end of the array.
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1) {
                right = right * nums[i + 1];
            }
            ans[i] *= right;
        }
        return ans;
    }

    public int[] productExceptSelf2(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return new int[0];
        }

        int len = nums.length, p;
        int[] arr = new int[len];

        arr[0] = p = 1;
        for (int i = 1; i < len; i++) {
            p = p * nums[i - 1];
            arr[i] = p;
        }

        p = 1;
        for (int i = len - 2; i >= 0; i--) {
            p = p * nums[i + 1];
            arr[i] *= p;
        }

        return arr;
    }
    public int[] productExceptSelf3(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return new int[0];
        }

        int[] mul1 = new int[nums.length];
        mul1[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            mul1[i] = mul1[i - 1] * nums[i - 1];
        }

        int[] mul2 = new int[nums.length];
        mul2[mul2.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            mul2[i] = mul2[i + 1] * nums[i + 1];
        }

        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ret[i] = mul1[i] * mul2[i];
        }

        return ret;
    }
}
