/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
import leetcode.common.TreeNode;

/**
 * Sum Root to Leaf Numbers.
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path
 * could represent a number.
 * 
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * 
 * Find the total sum of all root-to-leaf numbers.
 * 
 * For example,
 * 
 *     1
 *    / \
 *   2   3
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * 
 * Return the sum = 12 + 13 = 25.
 * 
 * @author Johnny
 */
public class Solution129 {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        List<String> list = helper(root);
        
        int sum = 0;
        for(String item : list) {
            sum += Integer.parseInt(item);
        }
        return sum;
    }
    
    private List<String> helper(TreeNode root) {
        if (root == null) {
            return new ArrayList<String>();
        }
        
        List<String> res = new ArrayList<String>();
        String str = String.valueOf(root.val);
        List<String> left = helper(root.left);
        List<String> right = helper(root.right);
        
        if (left.size() > 0 || right.size() > 0) {
            for (String item : left) {
                res.add(str + item);
            }
            for (String item : right) {
                res.add(str + item);
            }
        } else {
            res.add(str);
        }
        return res;
    }
}
