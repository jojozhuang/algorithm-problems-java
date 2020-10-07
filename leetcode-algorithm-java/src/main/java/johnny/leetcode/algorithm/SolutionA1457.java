package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1457. Pseudo-Palindromic Paths in a Binary Tree
 *
 * Given a binary tree where node values are digits from 1 to 9. A path in the binary tree is said to be pseudo-palindromic if at least one permutation of the node values in the path is a palindrome.
 *
 * Return the number of pseudo-palindromic paths going from the root node to leaf nodes.
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: root = [2,3,1,3,1,null,1]
 * Output: 2
 * Explanation: The figure above represents the given binary tree. There are three paths going from the root node to leaf nodes: the red path [2,3,3], the green path [2,1,1], and the path [2,3,1]. Among these paths only red path and green path are pseudo-palindromic paths since the red path [2,3,3] can be rearranged in [3,2,3] (palindrome) and the green path [2,1,1] can be rearranged in [1,2,1] (palindrome).
 * Example 2:
 *
 *
 *
 * Input: root = [2,1,1,1,3,null,null,null,null,null,1]
 * Output: 1
 * Explanation: The figure above represents the given binary tree. There are three paths going from the root node to leaf nodes: the green path [2,1,1], the path [2,1,3,1], and the path [2,1]. Among these paths only the green path is pseudo-palindromic since [2,1,1] can be rearranged in [1,2,1] (palindrome).
 * Example 3:
 *
 * Input: root = [9]
 * Output: 1
 *
 *
 * Constraints:
 *
 * The given binary tree will have between 1 and 10^5 nodes.
 * Node values are digits from 1 to 9.
 *
 */
public class SolutionA1457 {
    public int pseudoPalindromicPaths (TreeNode root) {
        List<List<Integer>> paths = new ArrayList<>();
        helper(root, new ArrayList<>(), paths);
        int count = 0;
        for (List<Integer> path : paths) {
            if (isPalindromic(path)) {
                count++;
            }
        }

        return count;
    }

    private void helper(TreeNode root, List<Integer> path, List<List<Integer>> paths) {
        if (root == null) {
            return;
        }

        path.add(root.val);
        if (root.left == null && root.right == null) {
            paths.add(new ArrayList<>(path));
            return;
        }

        helper(root.left, new ArrayList<>(path), paths);
        helper(root.right, new ArrayList<>(path), paths);
    }

    private boolean isPalindromic(List<Integer> path) {
        int[] count = new int[9];
        for (Integer i : path) {
            count[i - 1]++;
        }

        int odd = 0;
        for (int num : count) {
            if (num % 2 == 1) {
                odd++;
            }
            if (odd > 1) {
                return false;
            }
        }

        return true;
    }
}
