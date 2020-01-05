package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.List;

/**
 * 1110. Delete Nodes And Return Forest
 * Given the root of a binary tree, each node in the tree has a distinct value.
 * <p>
 * After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint union of trees).
 * <p>
 * Return the roots of the trees in the remaining forest.  You may return the result in any order.
 * <p>
 * Example 1:
 * Input: root = [1,2,3,4,5,6,7], to_delete = [3,5]
 * Output: [[1,2,null,4],[6],[7]]
 * <p>
 * Constraints:
 * <pre>{@code
 * The number of nodes in the given tree is at most 1000.
 * Each node has a distinct value between 1 and 1000.
 * to_delete.length <= 1000
 * to_delete contains distinct values between 1 and 1000.
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1110 {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        return null;
    }
}
