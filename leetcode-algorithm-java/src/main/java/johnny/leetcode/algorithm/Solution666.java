package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 666. Path Sum IV
 * If the depth of a tree is smaller than 5, then this tree can be represented by a list of three-digits integers.
 * <p>
 * For each integer in this list:
 * The hundreds digit represents the depth D of this node, 1 <= D <= 4.
 * The tens digit represents the position P of this node in the level it belongs to, 1 <= P <= 8. The position is the same as that in a full binary tree.
 * The units digit represents the value V of this node, 0 <= V <= 9.
 * Given a list of ascending three-digits integers representing a binary with the depth smaller than 5. You need to return the sum of all paths from the root towards the leaves.
 * <p>
 * Example 1:
 * Input: [113, 215, 221]
 * Output: 12
 * Explanation:
 * The tree that the list represents is:
 * 3
 * / \
 * 5   1
 * <p>
 * The path sum is (3 + 5) + (3 + 1) = 12.
 * Example 2:
 * Input: [113, 221]
 * Output: 4
 * Explanation:
 * The tree that the list represents is:
 * 3
 * \
 * 1
 * <p>
 * The path sum is (3 + 1) = 4.
 *
 * @author Johnny
 */
public class Solution666 {
    public int pathSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int key = num / 10;
            int value = num % 10;
            map.put(key, value);
        }

        int[] sum = new int[1];
        dfs(nums[0] / 10, 0, map, sum);

        return sum[0];
    }

    private void dfs(int root, int preSum, Map<Integer, Integer> map, int[] sum) {
        int level = root / 10;
        int pos = root % 10;
        int left = (level + 1) * 10 + pos * 2 - 1;
        int right = (level + 1) * 10 + pos * 2;

        int curSum = preSum + map.get(root);

        if (!map.containsKey(left) && !map.containsKey(right)) {
            sum[0] += curSum;
            return;
        }

        if (map.containsKey(left)) {
            dfs(left, curSum, map, sum);
        }
        if (map.containsKey(right)) {
            dfs(right, curSum, map, sum);
        }
    }
}
