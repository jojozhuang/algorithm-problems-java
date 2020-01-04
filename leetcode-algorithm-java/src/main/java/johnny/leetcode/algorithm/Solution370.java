package johnny.leetcode.algorithm;

/**
 * Range Addition.
 * Assume you have an array of length n initialized with all 0's and are given
 * k update operations.
 * <p>
 * Each operation is represented as a triplet: [startIndex, endIndex, inc]
 * which increments each element of subarray A[startIndex ... endIndex]
 * (startIndex and endIndex inclusive) with inc.
 * <p>
 * Return the modified array after all k operations were executed.
 * Example:
 * Given:
 * <p>
 * length = 5,
 * updates = [
 * [1,  3,  2],
 * [2,  4,  3],
 * [0,  2, -2]
 * ]
 * <p>
 * Output:
 * <p>
 * [-2, 0, 3, 5, 3]
 * Explanation:
 * Initial state:
 * [ 0, 0, 0, 0, 0 ]
 * <p>
 * After applying operation [1, 3, 2]:
 * [ 0, 2, 2, 2, 0 ]
 * <p>
 * After applying operation [2, 4, 3]:
 * [ 0, 2, 5, 5, 3 ]
 * <p>
 * After applying operation [0, 2, -2]:
 * [-2, 0, 3, 5, 3 ]
 * Hint:
 * Thinking of using advanced data structures? You are thinking it too complicated.
 * <p>
 * For each update operation, do you really need to update all elements between i and j?
 * Update only the first and end element is sufficient.
 * The optimal time complexity is O(k + n) and uses O(1) extra space.
 *
 * @author Johnny
 */
public class Solution370 {
    // O(n + m)
    public int[] getModifiedArray2(int length, int[][] updates) {
        int[] res = new int[length];
        for (int[] update : updates) {
            int start = update[0];
            int end = update[1];
            int value = update[2];

            res[start] += value;

            if (end < length - 1)
                res[end + 1] -= value;

        }

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += res[i];
            res[i] = sum;
        }

        return res;
    }

    // Naive, O(n*m), n is the length of matrix, m is the length
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
        for (int[] update : updates) {
            int start = update[0];
            int end = update[1];
            int value = update[2];

            for (int i = start; i <= end; i++) {
                res[i] += value;
            }
        }

        return res;
    }
}
