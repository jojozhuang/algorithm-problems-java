package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 426. Convert Binary Search Tree to Sorted Doubly Linked List
Convert a BST to a sorted circular doubly-linked list in-place. Think of the left and right pointers as synonymous to the previous and next pointers in a doubly-linked list.

Let's take the following BST as an example, it may help you understand the problem better:
 
We want to transform this BST into a circular doubly linked list. Each node in a doubly linked list has a predecessor and successor. For a circular doubly linked list, the predecessor of the first element is the last element, and the successor of the last element is the first element.

The figure below shows the circular doubly linked list for the BST above. The "head" symbol means the node it points to is the smallest element of the linked list.
 
Specifically, we want to do the transformation in place. After the transformation, the left pointer of the tree node should point to its predecessor, and the right pointer should point to its successor. We should return the pointer to the first element of the linked list.

The figure below shows the transformed BST. The solid line indicates the successor relationship, while the dashed line means the predecessor relationship.

 * @author Johnny
 */
public class Solution426 {
    public class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };
    
    // recursive
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        
        Node[] node = helper(root);
        node[0].left = node[1];
        node[1].right = node[0];
        return node[0];
    }
    
    private Node[] helper(Node root) {
        if (root == null) {
            return null;
        }
        
        Node dummy = new Node();
        // left
        Node[] left = helper(root.left);
        if (left != null) {
            left[1].right = root;
            root.left = left[1];
            dummy.right = left[0];
        } else {
            dummy.right = root;
        }
        // right
        Node tail = null;
        Node[] right = helper(root.right);
        if (right != null) {
            root.right = right[0];
            right[0].left = root;
            tail = right[1];
        } else {
            tail = root;
        }
        return new Node[]{dummy.right, tail};
    }
    
    public Node treeToDoublyList2(Node root) {
        if (root == null) {
            return null;
        }
        
        List<Node> list = inorderTraversal(root);
        
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).right = list.get(i+1);
            list.get(i+1).left = list.get(i);
        }
        
        list.get(list.size()-1).right = list.get(0);
        list.get(0).left = list.get(list.size()-1);
        return list.get(0);
    }
    
    private List<Node> inorderTraversal(Node root) {
        List<Node> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Stack<Node> stack = new Stack<Node>();
        Node curr = root;

        while (curr != null || !stack.empty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr);
            curr = curr.right;
        }

        return res;
    }
}
