package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution100;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution100Test {
    
    public Solution100Test() {
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
     * Test of isSameTree method, of class Solution100.
     */
    @Test
    public void testIsSameTree() {
        System.out.println("isSameTree");
        TreeNode p = null;
        TreeNode q = null;
        Solution100 instance = new Solution100();
        boolean expResult = true;
        boolean result = instance.isSameTree(p, q);
        assertEquals(expResult, result);
        
        TreeNode p2 = new TreeNode(1);
        TreeNode q2 = null;
        assertEquals(false, instance.isSameTree(p2, q2));

        TreeNode p3 = new TreeNode(1);
        TreeNode q3 = new TreeNode(1);
        assertEquals(true, instance.isSameTree(p3, q3));

        TreeNode p4 = new TreeNode(1);
        p4.left = new TreeNode(2);
        TreeNode q4 = new TreeNode(1);
        assertEquals(false, instance.isSameTree(p4, q4));

        TreeNode p5 = new TreeNode(1);
        p5.left = new TreeNode(2);
        TreeNode q5 = new TreeNode(1);
        q5.right = new TreeNode(2);
        assertEquals(false, instance.isSameTree(p5, q5));

        TreeNode p6 = new TreeNode(1);
        p6.left = new TreeNode(2);
        p6.right = new TreeNode(3);
        TreeNode q6 = new TreeNode(1);
        q6.left = new TreeNode(2);
        q6.right = new TreeNode(3);
        assertEquals(true, instance.isSameTree(p6, q6));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
