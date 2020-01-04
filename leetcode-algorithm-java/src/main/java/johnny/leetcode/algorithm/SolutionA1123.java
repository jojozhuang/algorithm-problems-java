package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * 1123. Lowest Common Ancestor of Deepest Leaves
 * Given a rooted binary tree, return the lowest common ancestor of its deepest leaves.
 * <p>
 * Recall that:
 * <p>
 * The node of a binary tree is a leaf if and only if it has no children
 * The depth of the root of the tree is 0, and if the depth of a node is d, the depth of each of its children is d+1.
 * The lowest common ancestor of a set S of nodes is the node A with the largest depth such that every node in S is in the subtree with root A.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: root = [1,2,3]
 * Output: [1,2,3]
 * Explanation:
 * The deepest leaves are the nodes with values 2 and 3.
 * The lowest common ancestor of these leaves is the node with value 1.
 * The answer returned is a TreeNode object (not an array) with serialization "[1,2,3]".
 * Example 2:
 * <p>
 * Input: root = [1,2,3,4]
 * Output: [4]
 * Example 3:
 * <p>
 * Input: root = [1,2,3,4,5]
 * Output: [2,4,5]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The given tree will have between 1 and 1000 nodes.
 * Each node of the tree will have a distinct value between 1 and 1000.
 *
 * @author Johnny
 */
public class SolutionA1123 {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return null;
    }
}
