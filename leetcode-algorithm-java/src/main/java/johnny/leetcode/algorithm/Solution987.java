package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

/**
 * 987. Vertical Order Traversal of a Binary Tree
 * Given a binary tree, return the vertical order traversal of its nodes values.
 * <p>
 * For each node at position (X, Y), its left and right children respectively will be at positions (X-1, Y-1) and (X+1, Y-1).
 * <p>
 * Running a vertical line from X = -infinity to X = +infinity, whenever the vertical line touches some nodes, we report the values of the nodes in order from top to bottom (decreasing Y coordinates).
 * <p>
 * If two nodes have the same position, then the value of the node that is reported first is the value that is smaller.
 * <p>
 * Return an list of non-empty reports in order of X coordinate.  Every report will have a list of values of nodes.
 * <p>
 * Example 1:
 * Input: [3,9,20,null,null,15,7]
 * Output: [[9],[3,15],[20],[7]]
 * Explanation:
 * Without loss of generality, we can assume the root node is at position (0, 0):
 * Then, the node with value 9 occurs at position (-1, -1);
 * The nodes with values 3 and 15 occur at positions (0, 0) and (0, -2);
 * The node with value 20 occurs at position (1, -1);
 * The node with value 7 occurs at position (2, -2).
 * <p>
 * Example 2:
 * Input: [1,2,3,4,5,6,7]
 * Output: [[4],[2],[1,5,6],[3],[7]]
 * Explanation:
 * The node with value 5 and the node with value 6 have the same position according to the given scheme.
 * However, in the report "[1,5,6]", the node value of 5 comes first since 5 is smaller than 6.
 * <p>
 * Note:
 * <p>
 * The tree will have between 1 and 1000 nodes.
 * Each node's value will be between 0 and 1000.
 *
 * @author Johnny
 */
public class Solution987 {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, List<Node>> map = new TreeMap<>();
        helper(root, 0, 0, map);

        List<List<Integer>> ans = new ArrayList<>();
        for (List<Node> list : map.values()) {
            Collections.sort(list, new NodeComparator());
            List<Integer> res = new ArrayList<>();
            for (Node node : list) {
                res.add(node.val);
            }
            ans.add(res);
        }
        return ans;
    }

    private void helper(TreeNode root, int x, int y, TreeMap<Integer, List<Node>> map) {
        if (root == null) {
            return;
        }
        if (!map.containsKey(x)) {
            map.put(x, new ArrayList<>());
        }
        map.get(x).add(new Node(x, y, root.val));
        helper(root.left, x - 1, y + 1, map);
        helper(root.right, x + 1, y + 1, map);
    }

    class NodeComparator implements Comparator<Node> {
        public int compare(Node n1, Node n2) {
            if (n1.x == n2.x) {
                if (n1.y == n2.y) {
                    return n1.val - n2.val;
                } else {
                    return n1.y - n2.y;
                }
            } else {
                return n1.x - n2.x;
            }
        }
    }

    class Node {
        public int x;
        public int y;
        public int val;

        public Node(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }
    }
}
