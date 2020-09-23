package johnny.lintcode.algorithm;

import java.util.*;

/**
 * Largest Number X Which Occurs X Times
 * Given an array A consisting of N integers, you should return the biggest value X, which occurs in A exactly X times. If there is no such value, you should return 0.
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [1..1,000,000,000].
 *
 * Have you met this question in a real interview?
 * Example
 * Example 1:
 * Input: [3, 8, 2, 3, 3, 2]
 * Output: 3
 * Explanation: The value 2 occurs exactly two times and the value 3 occurs exactly three times. Meanwhile, the maximum of 2 and 3 is 3 so the answer is 3.
 *
 * Example 2:
 * Input: [3, 1, 4, 1, 5]
 * Output: 0
 * Explanation: There is no value which meets the task conditions so the answer is 0.
 *
 */
public class LargestNumberXWhichOccursXTimes {
    /**
     * @param arr: an array of integers
     * @return: return the biggest value X, which occurs in A exactly X times.
     */
    public int findX(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
        }

        for (Integer key : map.keySet()) {
            if (key.equals(map.get(key))) {
                return key;
            }
        }
        return 0;
    }
}
