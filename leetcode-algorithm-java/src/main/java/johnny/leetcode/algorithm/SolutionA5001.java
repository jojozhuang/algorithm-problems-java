package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;
import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Linked List in Binary Tree
 * @author Johnny
 */
public class SolutionA5001 {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }

        if (head == null) {
            return true;
        }

        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append(",");
            head = head.next;
        }
        //sb.setLength(sb.length() - 1);
        String listval = sb.toString(); // 4,2,8,

        List<String> list = new ArrayList<>();
        dfs(root, "", list);
        for (String str : list) {
            if (str.indexOf(listval) >= 0) {
                return true;
            }
        }

        return false;
    }

    private void dfs(TreeNode root, String path, List<String> list) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            list.add(path + root.val + ",");
            return;
        }

        dfs(root.left, path + root.val + ",", list);
        dfs(root.right, path + root.val + ",", list);
    }
}
