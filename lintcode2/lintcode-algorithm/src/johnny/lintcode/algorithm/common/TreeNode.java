package johnny.lintcode.algorithm.common;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Johnny
 */
 public class TreeNode {
     public int val;
     public TreeNode left;
     public TreeNode right;
     public TreeNode(int x) { val = x; }
     
     public static TreeNode CreateInstance(String[] arr) {  
        List<String> serial = Arrays.asList(arr);
        if(serial == null || serial.size() == 0) {
            return null;         
        }
        
        Queue<String> queueString = new LinkedList<>(serial);
        Queue<TreeNode> queueNode = new LinkedList<>();
        
        TreeNode root = new TreeNode(Integer.parseInt(serial.get(0)));
        queueNode.offer(root);
        
        String str = "";
        queueString.remove(); // remove the first one, it is root;
        while(!queueString.isEmpty()) {
            TreeNode node = queueNode.poll();
            if (node != null) {
                str = queueString.poll();
                if (!str.equals("#")) {
                    node.left = new TreeNode(Integer.parseInt(str));
                    queueNode.add(node.left);
                }
                str = queueString.poll();
                if (!str.equals("#")) {
                    node.right = new TreeNode(Integer.parseInt(str));
                    queueNode.add(node.right);
                }                
            }
        }
        
        return root;
     }
 }
