package johnny.leetcode.algorithm;

/**
 * 1090. Largest Values From Labels
 * We have a set of items: the i-th item has value values[i] and label labels[i].
 * <p>
 * Then, we choose a subset S of these items, such that:
 * <p>
 * {@code |S| <= num_wanted}
 * {@code For every label L, the number of items in S with label L is <= use_limit.}
 * Return the largest possible sum of the subset S.
 * <p>
 * Example 1:
 * Input: values = [5,4,3,2,1], labels = [1,1,2,2,3], num_wanted = 3, use_limit = 1
 * Output: 9
 * Explanation: The subset chosen is the first, third, and fifth item.
 * <p>
 * Example 2:
 * Input: values = [5,4,3,2,1], labels = [1,3,3,3,2], num_wanted = 3, use_limit = 2
 * Output: 12
 * Explanation: The subset chosen is the first, second, and third item.
 * <p>
 * Example 3:
 * Input: values = [9,8,8,7,6], labels = [0,0,0,1,1], num_wanted = 3, use_limit = 1
 * Output: 16
 * Explanation: The subset chosen is the first and fourth item.
 * <p>
 * Example 4:
 * Input: values = [9,8,8,7,6], labels = [0,0,0,1,1], num_wanted = 3, use_limit = 2
 * Output: 24
 * Explanation: The subset chosen is the first, second, and fourth item.
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= values.length == labels.length <= 20000
 * 0 <= values[i], labels[i] <= 20000
 * 1 <= num_wanted, use_limit <= values.length
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1090 {
    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
        return 0;
    }
}
