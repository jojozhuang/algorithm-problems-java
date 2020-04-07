package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * @author Johnny
 */
public class Solution889 {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        if (pre == null || pre.length == 0 || post == null ||
                post.length == 0 || pre.length != post.length) {
            return null;
        }

        return helper(pre, 0, pre.length - 1, post, 0, post.length - 1);
    }

    private TreeNode helper(int[] pre, int prestart, int preend,
                            int[] post, int poststart, int postend) {
        if (prestart > preend || poststart > postend) {
            return null;
        }

        TreeNode root = new TreeNode(pre[prestart]);

        if (prestart + 1 > preend) {
            return root;
        }

        int index = -1; // index of left child in post order
        for (int i = poststart; i <= postend; i++) {
            if (post[i] == pre[prestart + 1]) {
                index = i;
                break;
            }
        }

        root.left = helper(pre, prestart + 1, prestart + 1 + (index - poststart), post, poststart, index);
        root.right = helper(pre, prestart + 1 + (index - poststart) + 1, preend, post, index + 1, postend - 1);
        return root;
    }
}
