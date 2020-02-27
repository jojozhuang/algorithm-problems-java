package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class SearchRangeinBinarySearchTreeTest extends JunitBase {
    /**
     * Test of searchRange method, of class SearchRangeinBinarySearchTree.
     */
    @Test
    public void testSearchRange() {
        System.out.println("searchRange");
        TreeNode root = null;
        int k1 = 0;
        int k2 = 0;
        SearchRangeinBinarySearchTree instance = new SearchRangeinBinarySearchTree();
        ArrayList<Integer> expResult = new ArrayList<Integer>();
        ArrayList<Integer> result = instance.searchRange(root, k1, k2);
        assertEquals(expResult, result);
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"1"});
        ArrayList<Integer> result2 = instance.searchRange(root2, 0, 0);
        Integer[] expResult2 = new Integer[] {};
        assertArrayEquals(expResult2, result2.toArray());
        
        TreeNode root3 = TreeNode.createInstance(new String[] {"1"});
        ArrayList<Integer> result3 = instance.searchRange(root3, 0, 1);
        Integer[] expResult3 = new Integer[] {1};
        assertArrayEquals(expResult3, result3.toArray());
        
        TreeNode root4 = TreeNode.createInstance(new String[] {"2","1", "#"});
        ArrayList<Integer> result4 = instance.searchRange(root4, 0, 3);
        Integer[] expResult4 = new Integer[] {1,2};
        assertArrayEquals(expResult4, result4.toArray());
        
        TreeNode root5 = TreeNode.createInstance(new String[] {"2","1","4","#","#","3","#"});
        ArrayList<Integer> result5 = instance.searchRange(root5, 3, 7);
        Integer[] expResult5 = new Integer[] {3,4};
        assertArrayEquals(expResult5, result5.toArray());
        
        TreeNode root6 = TreeNode.createInstance(new String[] {"2","1","4","#","#","3","#"});
        ArrayList<Integer> result6 = instance.searchRange(root6, 3, 3);
        Integer[] expResult6 = new Integer[] {3};
        assertArrayEquals(expResult6, result6.toArray());
        
        TreeNode root7 = TreeNode.createInstance(new String[] {"101","92","#","81","#","75","#","41","#","#","65"});
        ArrayList<Integer> result7 = instance.searchRange(root7, 41, 41);
        Integer[] expResult7 = new Integer[] {41};
        assertArrayEquals(expResult7, result7.toArray());
    }
}
