package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 894. All Possible Full Binary Trees
 * A full binary tree is a binary tree where each node has exactly 0 or 2 children.
 * <p>
 * Return a list of all possible full binary trees with N nodes.  Each element of the answer is the root node of one possible tree.
 * <p>
 * Each node of each tree in the answer must have node.val = 0.
 * <p>
 * You may return the final list of trees in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 7
 * Output: [[0,0,0,null,null,0,0,null,null,0,0],[0,0,0,null,null,0,0,0,0],[0,0,0,0,0,0,0],[0,0,0,0,0,null,null,null,null,0,0],[0,0,0,0,0,null,null,0,0]]
 * Explanation:
 * <p>
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= N <= 20
 *
 * @author Johnny
 */
public class Solution894 {
    Map<Integer, List<TreeNode>> memo = new HashMap<>();

    public List<TreeNode> allPossibleFBT(int N) {
        if (!memo.containsKey(N)) {
            List<TreeNode> ans = new LinkedList<TreeNode>();
            if (N == 1) {
                ans.add(new TreeNode(0));
            } else if (N % 2 == 1) {
                for (int i = 0; i < N; i++) {
                    int j = N - 1 - i;
                    for (TreeNode left : allPossibleFBT(i)) {
                        for (TreeNode right : allPossibleFBT(j)) {
                            TreeNode bns = new TreeNode(0);
                            bns.left = left;
                            bns.right = right;
                            ans.add(bns);
                        }
                    }
                }
            }
            memo.put(N, ans);
        }

        return memo.get(N);
    }
}
