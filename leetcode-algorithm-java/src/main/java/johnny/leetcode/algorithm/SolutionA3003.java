package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class SolutionA3003 {
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
