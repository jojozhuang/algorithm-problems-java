package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 559. Maximum Depth of N-ary Tree
 * 
 * Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

For example, given a 3-ary tree:

We should return its max depth, which is 3.

Note:

The depth of the tree is at most 1000.
The total number of nodes is at most 5000.

 * @author Johnny
 */
public class Solution559 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        
        int max = 1;
        if (root.children != null) {
            for (Node node : root.children) {
                max = Math.max(max, maxDepth(node) + 1);
            }
        }
        
        return max;
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
