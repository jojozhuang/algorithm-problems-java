package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * 536. Construct Binary Tree from String
 * You need to construct a binary tree from a string consisting of parenthesis and integers.
 * <p>
 * The whole input represents a binary tree. It contains an integer followed by zero, one or two pairs of parenthesis. The integer represents the root's value and a pair of parenthesis contains a child binary tree with the same structure.
 * <p>
 * You always start to construct the left child node of the parent first if it exists.
 * <p>
 * Example:
 * Input: "4(2(3)(1))(6(5))"
 * Output: return the tree root node representing the following tree:
 * <p>
 * 4
 * /   \
 * 2     6
 * / \   /
 * 3   1 5
 * Note:
 * There will only be '(', ')', '-' and '0' ~ '9' in the input string.
 * An empty tree is represented by "" instead of "()".
 *
 * @author Johnny
 */
public class Solution536 {
    public TreeNode str2tree(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }

        int leftChild = s.indexOf("(");
        if (leftChild == -1) { // left node not found
            return new TreeNode(Integer.parseInt(s));
        }

        int val = Integer.parseInt(s.substring(0, leftChild));
        TreeNode root = new TreeNode(val);
        int start = leftChild;
        int leftParenCount = 0;

        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftParenCount++;
            } else if (s.charAt(i) == ')') {
                leftParenCount--;
            }
            if (leftParenCount == 0 && start == leftChild) {
                root.left = str2tree(s.substring(start + 1, i));
                start = i + 1;
            } else if (leftParenCount == 0) {
                root.right = str2tree(s.substring(start + 1, i));
            }
        }
        return root;
    }
}
