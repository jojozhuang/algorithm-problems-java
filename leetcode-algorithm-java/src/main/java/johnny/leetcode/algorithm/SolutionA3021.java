package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class SolutionA3021 {
    public int countPairs(TreeNode root, int distance) {
        List<String> list = new ArrayList<>();

        helper(root, "", list);

        int ans = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                String s1 = list.get(i);
                String s2 = list.get(j);
                int dis = 0;
                int k = 0;
                int minLen = Math.min(s1.length(), s2.length());
                for (; k < minLen; k++) {
                    if (s1.charAt(k) != s2.charAt(k)) {
                        dis += 2;
                        break;
                    }
                }

                dis += (minLen - k - 1) * 2;

                dis += Math.abs(s1.length() - s2.length());
                if (dis <= distance) {
                    ans++;
                }
            }
        }

        return ans;
    }

    private void helper(TreeNode root, String path, List<String> list) {
        if (root.left == null && root.right == null) {
            list.add(path);
            return;
        }
        if (root.left != null) {
            helper(root.left, path + "0", list);
        }
        if (root.right != null) {
            helper(root.right, path + "1", list);
        }
    }
}
