package johnny.hackerrank.algorithm;

import java.util.ArrayList;
import java.util.Collections;

import johnny.hackerrank.algorithm.common.TreeNode;

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
