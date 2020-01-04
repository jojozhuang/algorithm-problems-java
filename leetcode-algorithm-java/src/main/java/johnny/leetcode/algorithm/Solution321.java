package johnny.leetcode.algorithm;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Create Maximum Number.
 * <p>
 * Given two arrays of length m and n with digits 0-9 representing two numbers.
 * Create the maximum number of length {@code k <= m + n} from digits of the two.
 * The relative order of the digits from the same array must be preserved.
 * Return an array of the k digits. You should try to optimize your time and
 * space complexity.
 * <p>
 * Example 1:
 * nums1 = [3, 4, 6, 5]
 * nums2 = [9, 1, 2, 5, 8, 3]
 * k = 5
 * return [9, 8, 6, 5, 3]
 * <p>
 * Example 2:
 * nums1 = [6, 7]
 * nums2 = [6, 0, 4]
 * k = 5
 * return [6, 7, 6, 0, 4]
 * <p>
 * Example 3:
 * nums1 = [3, 9]
 * nums2 = [8, 9]
 * k = 3
 * return [9, 8, 9]
 *
 * @author Johnny
 */
public class Solution321 {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;

        int[] ans = null;
        for (int i = 0; i <= k; i++) {
            if (i > m || k - i > n) {
                continue;
            }
            int[] top1 = top(nums1, i);
            int[] top2 = top(nums2, k - i);
            int[] res = merge(top1, top2);
            if (ans == null) {
                ans = res;
            } else {
                if (isLarge(res, 0, ans, 0)) {
                    ans = res;
                }
            }
        }

        return ans;
    }

    private int[] top(int[] nums, int k) {
        if (k >= nums.length) {
            return nums;
        }
        if (k == 0) {
            return new int[]{};
        }
        int pop = nums.length - k;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && pop > 0) {
                if (nums[i] > deque.peekLast()) {
                    deque.pollLast();
                    pop--;
                } else {
                    break;
                }
            }
            deque.addLast(nums[i]);
        }
        int[] ans = new int[k];
        int i = 0;
        for (int num : deque) {
            ans[i] = num;
            i++;
            if (i >= k) {
                break;
            }
        }
        return ans;
    }

    private int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m == 0) {
            return nums2;
        }
        if (n == 0) {
            return nums1;
        }

        int[] ans = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m || j < n) {
            if (i >= m) {
                ans[k] = nums2[j];
                j++;
            } else if (j >= n) {
                ans[k] = nums1[i];
                i++;
            } else {
                if (isLarge(nums1, i, nums2, j)) {
                    ans[k] = nums1[i];
                    i++;
                } else {
                    ans[k] = nums2[j];
                    j++;
                }
            }

            k++;
        }

        return ans;
    }

    private boolean isLarge(int[] nums1, int i, int[] nums2, int j) {
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                i++;
                j++;
                continue;
            } else if (nums1[i] > nums2[j]) {
                return true;
            } else {
                return false;
            }
        }

        return true;
    }

    //https://discuss.leetcode.com/topic/32272/share-my-greedy-solution
    //https://www.hrwhisper.me/leetcode-create-maximum-number/
    //http://blog.csdn.net/xyqzki/article/details/50405256
    public int[] maxNumber2(int[] nums1, int[] nums2, int k) {
        if (nums1 == null || nums2 == null) {
            return null;
        }
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[k];
        for (int i = Math.max(0, k - m); i <= k && i <= n; ++i) {
            int[] candidate = merge(maxArray(nums1, i), maxArray(nums2, k - i), k);
            if (compare(candidate, 0, ans, 0)) {
                ans = candidate;
            }
        }
        return ans;
    }

    private int[] merge(int[] nums1, int[] nums2, int k) {
        int[] ans = new int[k];
        for (int i = 0, j = 0, r = 0; r < k; ++r)
            ans[r] = compare(nums1, i, nums2, j) ? nums1[i++] : nums2[j++];
        return ans;
    }

    public boolean compare(int[] nums1, int i, int[] nums2, int j) {
        while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
            i++;
            j++;
        }
        return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]);
    }

    private int[] maxArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[k];
        for (int i = 0, j = 0; i < n; ++i) {
            while (n - i + j > k && j > 0 && ans[j - 1] < nums[i]) {
                j--;
            }
            if (j < k) {
                ans[j++] = nums[i];
            }
        }
        return ans;
    }
}
