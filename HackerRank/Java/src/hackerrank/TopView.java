/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;
import hackerrank.common.TreeNode;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Johnny
 */
public class TopView {
    public Integer[] top_view(TreeNode root)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root != null) {
            ArrayList<Integer> leftlist = new ArrayList<Integer>();
            TreeNode left = root.left;
            while(left != null) {
                leftlist.add(left.data);
                left = left.left;
            }
            Collections.reverse(leftlist);
            list.addAll(leftlist);
            list.add(root.data);
            TreeNode right = root.right;
            while(right != null) {
                list.add(right.data);
                right = right.right;
            }
        }        

        Integer[] ret = new Integer[list.size()];
        ret = list.toArray(ret);
        
        return ret;
        
        
    }  
}
