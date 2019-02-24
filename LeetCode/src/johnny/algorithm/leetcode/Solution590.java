package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 590. N-ary Tree Postorder Traversal
Given an n-ary tree, return the postorder traversal of its nodes' values.
 
For example, given a 3-ary tree:

Return its postorder traversal as: [5,6,3,2,4,1].

Note: Recursive solution is trivial, could you do it iteratively?
 * @author Johnny
 */
public class Solution590 {
    // iteration
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.peek();
            if (node.children == null || node.children.size() == 0) {
                ans.add(node.val);
                stack.pop();
            } else {
                for (int i = node.children.size() - 1; i >= 0 ; i--) {
                    stack.push(node.children.get(i));
                }
                node.children.clear();
            }
        }
        
        return ans;
    }
    
    // recurison
    public List<Integer> postorder2(Node root) {
        List<Integer> ans = new ArrayList<Integer>();
        if (root == null) {
            return ans;
        }
        
        if (root.children != null) {
            for (Node node : root.children) {
                ans.addAll(postorder(node));
            }
        }
        
        ans.add(root.val);
        
        return ans;
    }
    
    public class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    
    // Decodes your encoded data to tree.
    public Node deserialize(String data) {
        if (data.isEmpty())
            return null;
        
        String[] ss=data.split(",");
        Queue<String> q = new LinkedList<>(Arrays.asList(ss));
        return deserializeHelper(q);
    }
    
    private Node deserializeHelper(Queue<String> q){
        Node root = new Node();
        root.val = Integer.parseInt(q.poll());
        int size = Integer.parseInt(q.poll());
        root.children = new ArrayList<Node>(size);
        for(int i = 0; i < size;i++){
            root.children.add(deserializeHelper(q));
        }
        return root;
    }
}
