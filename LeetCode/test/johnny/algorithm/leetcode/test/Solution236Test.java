package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution236;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution236Test {
    
    public Solution236Test() {
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
     * Test of lowestCommonAncestor method, of class Solution236.
     */
    @Test
    public void testLowestCommonAncestor() {
        System.out.println("lowestCommonAncestor");
        TreeNode root = null;
        TreeNode p = null;
        TreeNode q = null;
        Solution236 instance = new Solution236();
        TreeNode expResult = null;
        TreeNode result = instance.lowestCommonAncestor(root, p, q);
        assertEquals(expResult, result);
        
        TreeNode root1 = new TreeNode(1);
        TreeNode p1 = new TreeNode(2);
        root1.left = p1;
        assertEquals(root1, instance.lowestCommonAncestor(root1, root1, p1));
        
        TreeNode root2 = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        root2.left = p2;
        TreeNode q2 = new TreeNode(3);
        root2.right = q2;
        assertEquals(root2, instance.lowestCommonAncestor(root2, p2, q2));
        
        TreeNode root3 = new TreeNode(1);
        TreeNode p3 = new TreeNode(2);
        root3.left = p3;
        TreeNode q3 = new TreeNode(3);
        root3.right = q3;
        assertEquals(root3, instance.lowestCommonAncestor(root3, p3, q3));
    }
}
