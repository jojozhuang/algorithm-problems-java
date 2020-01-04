package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 431. Encode N-ary Tree to Binary Tree
 * 
 * Design an algorithm to encode an N-ary tree into a binary tree and decode the binary tree to get the original N-ary tree. An N-ary tree is a rooted tree in which each node has no more than N children. Similarly, a binary tree is a rooted tree in which each node has no more than 2 children. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that an N-ary tree can be encoded to a binary tree and this binary tree can be decoded to the original N-nary tree structure.

For example, you may encode the following 3-ary tree to a binary tree in this way:

Note that the above is just an example which might or might not work. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.

Note:

N is in the range of [1, 1000]
Do not use class member/global/static variables to store states. Your encode and decode algorithms should be stateless.
 * @author Johnny
 */
public class Solution431 {
    // Next Level -> left, Same Level -> right
    // Encodes an n-ary tree to a binary tree.
    public TreeNode encode(Node root) {
        if (root == null) {
            return null;
        }
        TreeNode result = new TreeNode(root.val);
        if (root.children.size() > 0) {
            result.left = encode(root.children.get(0));
        }
        TreeNode cur = result.left;
        for (int i = 1; i < root.children.size(); i++) {
            cur.right = encode(root.children.get(i));
            cur = cur.right;
        }
        return result;
    }

    // Decodes your binary tree to an n-ary tree.
    public Node decode(TreeNode root) {
        if (root == null) {
            return null;
        }
        Node result = new Node(root.val, new LinkedList<>());
        TreeNode cur = root.left;
        while (cur != null) {
            result.children.add(decode(cur));
            cur = cur.right;
        }
        return result;
    }
    
    // Definition for a Node.
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
    
    public String serialize(Node root) {
        if (root == null) {
            return "";
        }
        
        List<String> list = new LinkedList<>();
        serializeHelper(root,list);
        return String.join(",",list);
    }
    
    private void serializeHelper(Node root, List<String> list){
        if (root == null){
            return;
        }
        list.add(String.valueOf(root.val));
        list.add(String.valueOf(root.children.size()));
        for (Node child : root.children){
            serializeHelper(child,list);
        }
    }
}
