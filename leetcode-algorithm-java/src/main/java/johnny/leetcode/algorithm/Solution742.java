package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import johnny.leetcode.algorithm.common.TreeNode;

/**
*742. Closest Leaf in a Binary Tree
*Given a binary tree where every node has a unique value, and a target key k, find the value of the nearest leaf node to target k in the tree.

Here, nearest to a leaf means the least number of edges travelled on the binary tree to reach any leaf of the tree. Also, a node is called a leaf if it has no children.

In the following examples, the input tree is represented in flattened form row by row. The actual root tree given will be a TreeNode object.

Example 1:

Input:
root = [1, 3, 2], k = 1
Diagram of binary tree:
          1
         / \
        3   2

Output: 2 (or 3)

Explanation: Either 2 or 3 is the nearest leaf node to the target of 1.
Example 2:

Input:
root = [1], k = 1
Output: 1

Explanation: The nearest leaf node is the root node itself.
Example 3:

Input:
root = [1,2,3,4,null,null,null,5,null,6], k = 2
Diagram of binary tree:
             1
            / \
           2   3
          /
         4
        /
       5
      /
     6

Output: 3
Explanation: The leaf node with value 3 (and not the leaf node with value 6) is nearest to the node with value 2.
Note:
root represents a binary tree with at least 1 node and at most 1000 nodes.
Every node has a unique node.val in range [1, 1000].
There exists some node in the given binary tree for which node.val == k.
 * @author Johnny
 */
public class Solution742 {
    TreeNode nodeK = null;
    public int findClosestLeaf(TreeNode root, int k) {
        Map<TreeNode, List<TreeNode>> map = new HashMap<>();
        dfs(map, root, k);
        Set<TreeNode> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(nodeK);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    return node.val;
                }
                set.add(node);
                List<TreeNode> neis = map.get(node);
                for (TreeNode nei : neis) {
                    if (!set.contains(nei)) {
                        queue.offer(nei);
                    }
                }
            }
        }
        
        return 0;
    }

    private void dfs(Map<TreeNode, List<TreeNode>> map, TreeNode root, int k) {
        if (root == null) {
            return;
        }
        
        if (root.val == k) {
            nodeK = root;
        }
        if (!map.containsKey(root)) {
            map.put(root, new ArrayList<TreeNode>());
        }
        if (root.left != null) {
            if (!map.containsKey(root.left)) {
                map.put(root.left, new ArrayList<TreeNode>());
            }
            map.get(root).add(root.left);
            map.get(root.left).add(root);
            dfs(map, root.left, k);
        }
        if (root.right != null) {
            if (!map.containsKey(root.right)) {
                map.put(root.right, new ArrayList<TreeNode>());
            }
            map.get(root).add(root.right);
            map.get(root.right).add(root);
            dfs(map, root.right, k);
        }
    }
}
