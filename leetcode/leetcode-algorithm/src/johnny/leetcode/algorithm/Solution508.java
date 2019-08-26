package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import johnny.leetcode.algorithm.common.TreeNode;

/**
 * Most Frequent Subtree Sum
 * 
 * Given the root of a tree, you are asked to find the most frequent subtree
 * sum. The subtree sum of a node is defined as the sum of all the node values 
 * formed by the subtree rooted at that node (including the node itself). So 
 * what is the most frequent subtree sum value? If there is a tie, return all 
 * the values with the highest frequency in any order.
 * 
 * Examples 1
 * Input:
 * 
 *   5
 *  /  \
 * 2   -3
 * return [2, -3, 4], since all the values happen only once, return all of
 * them in any order.
 * 
 * Examples 2
 * Input:
 * 
 *    5
 *  /  \
 * 2   -5
 * return [2], since 2 happens twice, however -5 only occur once.
 * Note: You may assume the sum of values in any subtree is in the range of 
 * 32-bit signed integer.
 * 
 * @author Johnny
 */
public class Solution508 {
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        helper(root, map);
        int max = Integer.MIN_VALUE;
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
    
    private int helper(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {
            return 0;
        }
        /*
        if (root.left == null && root.right == null) {
            map.put(root.val, map.getOrDefault(root.val, 0) + 1)
            return root.val;
        }*/
        
        int left = helper(root.left, map);
        int right = helper(root.right, map);
        int sum = root.val + left + right;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        return sum;
    }
    
    int maxCount = 0;

    public int[] findFrequentTreeSum2(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        postOrder(root, map);
        
        List<Integer> res = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == maxCount) {
                res.add(key);
            }
        }
        
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
    
    private int postOrder(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {
            return 0;
        }
        
        int left = postOrder(root.left, map);
        int right = postOrder(root.right, map);
        
        int sum = left + right + root.val;
        int count = map.getOrDefault(sum, 0) + 1;
        map.put(sum, count);
        
        maxCount = Math.max(maxCount, count);
        
        return sum;
    }
}
