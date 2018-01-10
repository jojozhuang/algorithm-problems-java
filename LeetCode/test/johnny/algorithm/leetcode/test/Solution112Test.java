package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution112;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution112Test {
    
    public Solution112Test() {
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
     * Test of hasPathSum method, of class Solution112.
     */
    @Test
    public void testHasPathSum() {
        System.out.println("hasPathSum");
        TreeNode root = null;
        int sum = 0;
        Solution112 instance = new Solution112();
        boolean expResult = false;
        boolean result = instance.hasPathSum(root, sum);
        assertEquals(expResult, result);
        
        TreeNode p1 = new TreeNode(1);
        assertEquals(false, instance.hasPathSum(p1, 2));

        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);
        assertEquals(true, instance.hasPathSum(p2, 3));

        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        p3.right = new TreeNode(2);
        assertEquals(false, instance.hasPathSum(p3, 4));

        TreeNode p4 = new TreeNode(1);
        p4.left = new TreeNode(2);
        p4.right = new TreeNode(2);
        p4.right.left = new TreeNode(3);
        assertEquals(true, instance.hasPathSum(p4, 6));

        TreeNode p5 = new TreeNode(1);
        p5.left = new TreeNode(2);
        p5.right = new TreeNode(2);
        p5.right.right = new TreeNode(3);
        p5.right.right.right = new TreeNode(4);
        assertEquals(true, instance.hasPathSum(p5, 10));
        
        TreeNode p6 = new TreeNode(-2);
        p6.right = new TreeNode(-3);
        assertEquals(true, instance.hasPathSum(p6, -5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
