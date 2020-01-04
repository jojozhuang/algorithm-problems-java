package johnny.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 904. Fruit Into Baskets
 * In a row of trees, the i-th tree produces fruit with type tree[i].
 * <p>
 * You start at any tree of your choice, then repeatedly perform the following steps:
 * <p>
 * Add one piece of fruit from this tree to your baskets.  If you cannot, stop.
 * Move to the next tree to the right of the current tree.  If there is no tree to the right, stop.
 * Note that you do not have any choice after the initial choice of starting tree: you must perform step 1, then step 2, then back to step 1, then step 2, and so on until you stop.
 * <p>
 * You have two baskets, and each basket can carry any quantity of fruit, but you want each basket to only carry one type of fruit each.
 * <p>
 * What is the total amount of fruit you can collect with this procedure?
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,1]
 * Output: 3
 * Explanation: We can collect [1,2,1].
 * Example 2:
 * <p>
 * Input: [0,1,2,2]
 * Output: 3
 * Explanation: We can collect [1,2,2].
 * If we started at the first tree, we would only collect [0, 1].
 * Example 3:
 * <p>
 * Input: [1,2,3,2,2]
 * Output: 4
 * Explanation: We can collect [2,3,2,2].
 * If we started at the first tree, we would only collect [1, 2].
 * Example 4:
 * <p>
 * Input: [3,3,3,1,2,1,1,2,3,3,4]
 * Output: 5
 * Explanation: We can collect [1,2,1,1,2].
 * If we started at the first tree or the eighth tree, we would only collect 4 fruits.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= tree.length <= 40000
 * 0 <= tree[i] < tree.length
 *
 * @author Johnny
 */
public class Solution904 {
    public int totalFruit(int[] tree) {
        if (tree == null || tree.length == 0) {
            return 0;
        }

        int max = 0;
        int left = 0;
        int right = 0;
        Set<Integer> set = new HashSet<Integer>();
        while (right < tree.length) {
            if (set.contains(tree[right])) {
                right++;
            } else {
                if (set.size() < 2) {
                    set.add(tree[right]);
                    right++;
                } else {
                    max = Math.max(max, right - left);
                    // backward
                    set.clear();
                    set.add(tree[right]);
                    left = right - 1;
                    while (left >= 0) {
                        if (set.contains(tree[left])) {
                            left--;
                        } else {
                            if (set.size() < 2) {
                                set.add(tree[left]);
                                left--;
                            } else {
                                left++;
                                break;
                            }
                        }
                    }
                }
            }
        }

        max = Math.max(max, right - left);

        return max;
    }
}
