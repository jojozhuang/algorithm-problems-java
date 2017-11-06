/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Johnny
 */
public class ListUtil {
    public static LinkedList<TreeNode> buildTreeLinkList(Integer[] array) {
        LinkedList<TreeNode> res = new LinkedList<TreeNode>();
        if (array == null || array.length == 0) {
            return res;
        }
        
        for (int i = 0; i < array.length; i++) {
            res.add(new TreeNode(array[i]));
        }
        
        return res;
    }
    
    public static List<LinkedList<TreeNode>> buildTreeLinkList2(Integer[][] array) {
        List<LinkedList<TreeNode>> res = new ArrayList<LinkedList<TreeNode>>();
        if (array == null || array.length == 0) {
            return res;
        }
        for (int i = 0; i < array.length; i++) {
            res.add(buildTreeLinkList(array[i]));
        }
        return res;
    }
    
    public static boolean isSameTreeLinkList(List<LinkedList<TreeNode>> l1, List<LinkedList<TreeNode>> l2) {
        if (l1 == null && l2 == null) {
            return true;
        }
        if (l1 == null && l2 != null) {
            return false;
        }
        if (l1 != null && l2 == null) {
            return false;
        }
        if (l1.size() != l2.size()) {
            return false;
        }
        
        for (int i = 0; i < l1.size(); i++) {
            LinkedList<TreeNode> l11 = l1.get(i);
            LinkedList<TreeNode> l21 = l2.get(i);
            if (l11 == null && l21 == null) {
                continue;
            }
            if (l11 == null && l21 != null) {
                return false;
            }
            if (l11 != null && l21 == null) {
                return false;
            }
            if (l11.size() != l21.size()) {
                return false;
            }
            for (int j = 0; j < l11.size(); j++) {
                TreeNode tn1 = l11.get(j);
                TreeNode tn2 = l21.get(j);
                if (tn1 == null && tn2 == null) {
                    continue;
                }
                if (tn1 == null && tn2 != null) {
                    return false;
                }
                if (tn1 != null && tn2 == null) {
                    return false;
                }
                if (tn1.val != tn2.val) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
