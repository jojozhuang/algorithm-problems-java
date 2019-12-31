package johnny.cc150.algorithm.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author Johnny
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    public TreeNode(int x) { val = x; }
    
    private static Map<Integer, TreeNode> map;
    public static TreeNode createInstance(String[] arr) {  
        map = new HashMap<Integer, TreeNode>();
        List<String> serial = Arrays.asList(arr);
        if(serial == null || serial.size() == 0) {
            return null;         
        }
        
        Queue<String> queueString = new LinkedList<>(serial);
        Queue<TreeNode> queueNode = new LinkedList<>();
        
        TreeNode root = new TreeNode(Integer.parseInt(serial.get(0)));
        queueNode.offer(root);
        map.put(root.val, root);
        
        String str = "";
        queueString.remove(); // remove the first one, it is root;
        while(!queueString.isEmpty()) {
            TreeNode node = queueNode.poll();
            if (node != null) {
                str = queueString.poll();
                if (!str.equals("#")) {
                    node.left = new TreeNode(Integer.parseInt(str));
                    node.left.parent = node;
                    queueNode.add(node.left);
                    map.put(node.left.val, node.left);
                }
                str = queueString.poll();
                if (!str.equals("#")) {
                    node.right = new TreeNode(Integer.parseInt(str));
                    node.right.parent = node;
                    queueNode.add(node.right);
                    map.put(node.right.val, node.right);
                }                
            }
        }
        
        return root;
    }
    
    public static TreeNode getNode(int val) {
        if (!map.containsKey(val)) {
            return null;
        } else {
            return map.get(val);
        }
    }
    
    public static boolean isSame(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null && t2 != null) {
            return false;
        }
        if (t1 != null && t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        
        return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
    }
    
    public boolean equals(TreeNode other) {
        if (this == other) {
            return true;
        }
        if(other == null || !(other instanceof TreeNode)) {
            return false;
        }
        return this.val == other.val;
    }
}
