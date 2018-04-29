package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution098;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution098Test {
    
    public Solution098Test() {
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
     * Test of isValidBST method, of class Solution098.
     */
    @Test
    public void testIsValidBST() {
        System.out.println("isValidBST");
        TreeNode root = null;
        Solution098 instance = new Solution098();
        boolean expResult = true;
        boolean result = instance.isValidBST(root);
        assertEquals(expResult, result);
        
        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);
        p2.right = new TreeNode(3);
        assertEquals(false, instance.isValidBST(p2));

        TreeNode p3 = new TreeNode(1);
        p3.right = new TreeNode(2);
        p3.right.right = new TreeNode(3);
        assertEquals(true, instance.isValidBST(p3));

        TreeNode p4 = new TreeNode(2);
        p4.left = new TreeNode(1);
        p4.right = new TreeNode(3);
        assertEquals(true, instance.isValidBST(p4));

        TreeNode p5 = new TreeNode(1);
        p5.right = new TreeNode(3);
        p5.right.left = new TreeNode(2);
        assertEquals(true, instance.isValidBST(p5));
        
        TreeNode p6 = new TreeNode(10);
        p6.left = new TreeNode(5);        
        p6.right = new TreeNode(15);
        p6.right.left = new TreeNode(6);
        p6.right.right = new TreeNode(20);
        assertEquals(false, instance.isValidBST(p6));
        
        TreeNode p7 = new TreeNode(1);
        p7.left = new TreeNode(1);       
        assertEquals(false, instance.isValidBST(p7));
        
        TreeNode p8 = new TreeNode(Integer.MIN_VALUE);
        p8.right = new TreeNode(Integer.MAX_VALUE);
        assertEquals(true, instance.isValidBST(p8));
        
        TreeNode p9 = new TreeNode(Integer.MAX_VALUE);
        p9.left = new TreeNode(Integer.MAX_VALUE);
        assertEquals(false, instance.isValidBST(p9));
        
        TreeNode p10 = new TreeNode(Integer.MIN_VALUE);
        p10.right = new TreeNode(Integer.MIN_VALUE);
        assertEquals(false, instance.isValidBST(p10));
    }
}
