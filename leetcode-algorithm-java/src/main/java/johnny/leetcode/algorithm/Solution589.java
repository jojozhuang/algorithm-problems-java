package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 589. N-ary Tree Preorder Traversal
 * <p>
 * Given an n-ary tree, return the preorder traversal of its nodes' values.
 * <p>
 * For example, given a 3-ary tree:
 * <p>
 * Return its preorder traversal as: [1,3,5,6,2,4].
 * <p>
 * Note: Recursive solution is trivial, could you do it iteratively?
 *
 * @author Johnny
 */
public class Solution589 {
    // iteration
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            ans.add(node.val);
            if (node.children != null) {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    stack.push(node.children.get(i));
                }
            }
        }
        return ans;
    }

    // recursion
    public List<Integer> preorder2(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        ans.add(root.val);
        for (Node child : root.children) {
            ans.addAll(preorder(child));
        }
        return ans;
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
