package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1200. Minimum Absolute Difference
 * <p>
 * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
 * <p>
 * Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
 * <p>
 * a, b are from arr
 * a < b
 * b - a equals to the minimum absolute difference of any two elements in arr
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [4,2,1,3]
 * Output: [[1,2],[2,3],[3,4]]
 * Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
 * Example 2:
 * <p>
 * Input: arr = [1,3,6,10,15]
 * Output: [[1,3]]
 * Example 3:
 * <p>
 * Input: arr = [3,8,-10,23,19,-4,-14,27]
 * Output: [[-14,-10],[19,23],[23,27]]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= arr.length <= 10^5
 * -10^6 <= arr[i] <= 10^6
 *
 * @author Johnny
 */
public class SolutionA1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Math.abs(arr[1] - arr[0]);
        for (int i = 2; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) < min) {
                min = Math.abs(arr[i] - arr[i - 1]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) == min) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i - 1]);
                list.add(arr[i]);
                ans.add(list);
            }
        }

        return ans;
    }
}
