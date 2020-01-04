package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 429. N-ary Tree Level Order Traversal
 * <p>
 * Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * <p>
 * For example, given a 3-ary tree:
 * <p>
 * We should return its level order traversal:
 * <p>
 * [
 * [1],
 * [3,2,4],
 * [5,6]
 * ]
 * <p>
 * Note:
 * <p>
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 *
 * @author Johnny
 */
public class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) {
            return res;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<Integer>();
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                Node node = queue.poll();
                list.add(node.val);
                if (node.children != null) {
                    for (Node child : node.children) {
                        queue.offer(child);
                    }
                }
            }
            res.add(list);
        }

        return res;
    }

    // Decodes your encoded data to tree.
    public Node deserialize(String data) {
        if (data.isEmpty())
            return null;

        String[] ss = data.split(",");
        Queue<String> q = new LinkedList<>(Arrays.asList(ss));
        return deserializeHelper(q);
    }

    ;

    private Node deserializeHelper(Queue<String> q) {
        Node root = new Node();
        root.val = Integer.parseInt(q.poll());
        int size = Integer.parseInt(q.poll());
        root.children = new ArrayList<Node>(size);
        for (int i = 0; i < size; i++) {
            root.children.add(deserializeHelper(q));
        }
        return root;
    }

    public class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
