package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution101;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution101Test {
    
    public Solution101Test() {
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
     * Test of isSymmetric method, of class Solution101.
     */
    @Test
    public void testIsSymmetric() {
        System.out.println("isSymmetric");
        TreeNode root = null;
        Solution101 instance = new Solution101();
        boolean expResult = true;
        boolean result = instance.isSymmetric(root);
        assertEquals(expResult, result);
        
        TreeNode p2 = new TreeNode(1);
        assertEquals(true, instance.isSymmetric(p2));

        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        assertEquals(false, instance.isSymmetric(p3));

        TreeNode p4 = new TreeNode(1);
        p4.left = new TreeNode(2);
        p4.right = new TreeNode(3);
        assertEquals(false, instance.isSymmetric(p4));

        TreeNode p5 = new TreeNode(1);
        p5.left = new TreeNode(2);
        p5.right = new TreeNode(2);
        assertEquals(true, instance.isSymmetric(p5));

        TreeNode p6 = new TreeNode(1);
        p6.left = new TreeNode(2);
        p6.right = new TreeNode(2);
        p6.right.left = new TreeNode(3);
        p6.right.right = new TreeNode(3);
        assertEquals(false, instance.isSymmetric(p6));

        TreeNode p7 = new TreeNode(1);
        p7.left = new TreeNode(2);
        p7.right = new TreeNode(2);
        p7.left.right = new TreeNode(3);
        p7.right.left = new TreeNode(3);
        assertEquals(true, instance.isSymmetric(p7));
    }
}
