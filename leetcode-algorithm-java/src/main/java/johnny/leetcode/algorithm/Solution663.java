package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

import johnny.algorithm.common.TreeNode;

/**
 *663. Equal Tree Partition
 Given a binary tree with n nodes, your task is to check if it's possible to partition the tree to two trees which have the equal sum of values after removing exactly one edge on the original tree.

Example 1:
Input:     
    5
   / \
  10 10
    /  \
   2   3

Output: True
Explanation: 
    5
   / 
  10
      
Sum: 15

   10
  /  \
 2    3

Sum: 15
Example 2:
Input:     
    1
   / \
  2  10
    /  \
   2   20

Output: False
Explanation: You can't split the tree into two trees with equal sum after removing exactly one edge on the tree.
Note:
The range of tree node value is in the range of [-100000, 100000].
1 <= n <= 10000
 * @author Johnny
 */
public class Solution663 {
    public boolean checkEqualTree(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = sum(root, map);
        if (sum % 2 != 0) {
            return false;
        }
        if (sum == 0) {
            return map.get(sum) > 1;
        }
        
        return map.containsKey(sum/2);
    }
    
    private int sum(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {
            return 0;
        }
        
        int sum = root.val + sum(root.left, map) + sum(root.right, map);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        return sum;
    }
    
    public boolean checkEqualTree2(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = getsum(root, map);
        if(sum == 0) {
            return map.getOrDefault(sum, 0) > 1;
        }
        return sum % 2 == 0 && map.containsKey(sum / 2);
    }
    
    public int getsum(TreeNode root, Map<Integer, Integer> map) {
        if(root == null) {
            return 0;
        }
        int sum = root.val + getsum(root.left, map) + getsum(root.right, map);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        return sum;
    }
}
