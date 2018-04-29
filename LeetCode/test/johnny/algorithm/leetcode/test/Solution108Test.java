package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution108;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution108Test {
    
    public Solution108Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sortedArrayToBST method, of class Solution108.
     */
    @Test
    public void testSortedArrayToBST() {
        System.out.println("sortedArrayToBST");
        int[] num = null;
        Solution108 instance = new Solution108();
        TreeNode expResult = null;
        TreeNode result = instance.sortedArrayToBST(num);
        assertEquals(expResult, result);
        
        TreeNode result1 = instance.sortedArrayToBST(new int[] {1,2,3});
        TreeNode expResult1 = TreeNode.createInstance(new String[] {"2","1","3"});
        assertEquals(expResult1.val, result1.val);
        assertEquals(expResult1.left.val, result1.left.val);
        assertEquals(expResult1.right.val, result1.right.val);
        
        TreeNode result2 = instance.sortedArrayToBST(new int[] {1,2,3,4,5,6,7,8,9});
        TreeNode expResult2 = TreeNode.createInstance(new String[] {"5","3","8","2","4","7","9","1","#","#","#","6","#"});
        assertEquals(expResult2.val, result2.val);
        assertEquals(expResult2.left.val, result2.left.val);
        assertEquals(expResult2.left.left.val, result2.left.left.val);
        assertEquals(expResult2.left.right.val, result2.left.right.val);
        assertEquals(expResult2.left.left.left.val, result2.left.left.left.val);
        assertEquals(expResult2.right.val, result2.right.val);
        assertEquals(expResult2.right.left.val, result2.right.left.val);
        assertEquals(expResult2.right.left.left.val, result2.right.left.left.val);
        assertEquals(expResult2.right.right.val, result2.right.right.val);
    }
}
