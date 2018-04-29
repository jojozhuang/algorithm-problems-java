package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution124;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution124Test {
    
    public Solution124Test() {
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
     * Test of maxPathSum method, of class Solution124.
     */
    @Test
    public void testMaxPathSum() {
        System.out.println("maxPathSum");
        TreeNode root = null;
        Solution124 instance = new Solution124();
        int expResult = Integer.MIN_VALUE;
        int result = instance.maxPathSum(root);
        assertEquals(expResult, result);
        
        TreeNode root1 = new TreeNode(1);        
        assertEquals(1, instance.maxPathSum(root1));
        
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        assertEquals(3, instance.maxPathSum(root2));
        
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        assertEquals(6, instance.maxPathSum(root3));
        
         TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(-1);
        root4.right = new TreeNode(3);
        assertEquals(4, instance.maxPathSum(root4));
    }
}
