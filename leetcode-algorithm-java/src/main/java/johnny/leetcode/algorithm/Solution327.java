package johnny.leetcode.algorithm;

/**
 * Count of Range Sum.
 * <p>
 * Given an integer array nums, return the number of range sums that lie in
 * [lower, upper] inclusive.
 * <p>
 * Range sum S(i, j) is defined as the sum of the elements in nums between
 * indices i and j (i ≤ j), inclusive.
 * <p>
 * Note:
 * A naive algorithm of O(n2) is trivial. You MUST do better than that.
 * <p>
 * Example:
 * Given nums = [-2, 5, -1], lower = -2, upper = 2,
 * Return 3.
 * The three ranges are : [0, 0], [2, 2], [0, 2] and their respective sums are: -2, -1, 2.
 *
 * @author Johnny
 */
public class Solution327 {
    //https://discuss.leetcode.com/topic/33738/share-my-solution
    public int countRangeSum(int[] nums, int lower, int upper) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        long[] sums = new long[n + 1];
        for (int i = 0; i < n; ++i)
            sums[i + 1] = sums[i] + nums[i];
        int ans = 0;
        for (int i = 0; i < n; ++i)
            for (int j = i + 1; j <= n; ++j)
                if (sums[j] - sums[i] >= lower && sums[j] - sums[i] <= upper)
                    ans++;
        return ans;
    }

    public int countRangeSum4(int[] nums, int lower, int upper) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        long[] sums = new long[n + 1];
        for (int i = 0; i < n; ++i)
            sums[i + 1] = sums[i] + nums[i];
        return countWhileMergeSort(sums, 0, n + 1, lower, upper);
    }

    private int countWhileMergeSort(long[] sums, int start, int end, int lower, int upper) {
        if (end - start <= 1) return 0;
        int mid = (start + end) / 2;
        int count = countWhileMergeSort(sums, start, mid, lower, upper)
                + countWhileMergeSort(sums, mid, end, lower, upper);
        int j = mid, k = mid, t = mid;
        long[] cache = new long[end - start];
        for (int i = start, r = 0; i < mid; ++i, ++r) {
            while (k < end && sums[k] - sums[i] < lower) k++;
            while (j < end && sums[j] - sums[i] <= upper) j++;
            while (t < end && sums[t] < sums[i]) cache[r++] = sums[t++];
            cache[r] = sums[i];
            count += j - k;
        }
        System.arraycopy(cache, 0, sums, start, t - start);
        return count;
    }

    public int countRangeSum2(int[] nums, int lower, int upper) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] BITree = new int[n + 1];
        // Store the actual values in BITree[] using update()
        for (int i = 0; i < n; i++) {
            updateBIT(BITree, n, i, nums[i]);
        }

        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = getSum(BITree, i, j);
                if (sum >= lower && sum <= upper) {
                    count++;
                }
            }
        }

        return count;
    }

    private void updateBIT(int[] BITree, int n, int index, int val) {
        index = index + 1;
        while (index <= n) {
            BITree[index] += val;
            index += index & (-index);
        }
    }

    private int getSum(int[] BITree, int index) {
        int sum = 0;
        index = index + 1;
        while (index > 0) {
            sum += BITree[index];

            // Move index to parent node in getSum View
            index -= index & (-index);
        }
        return sum;
    }

    private int getSum(int[] BITree, int from, int to) {
        if (from >= 0 && to >= 0 && to >= from) {
            return getSum(BITree, to) - getSum(BITree, from - 1);
        } else {
            return -1;
        }
    }

    // O(n^2)
    public int countRangeSum3(int[] nums, int lower, int upper) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        long[][] sum = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    sum[i][j] = nums[i];
                } else {
                    sum[i][j] = sum[i][j - 1] + nums[j];
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (sum[i][j] >= lower && sum[i][j] <= upper) {
                    count++;
                }
            }
        }

        return count;
    }
}
