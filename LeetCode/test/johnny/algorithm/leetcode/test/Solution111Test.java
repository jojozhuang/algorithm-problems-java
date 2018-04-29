package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution111;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution111Test {
    
    public Solution111Test() {
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
     * Test of minDepth method, of class Solution111.
     */
    @Test
    public void testMinDepth() {
        System.out.println("minDepth");
        TreeNode root = null;
        Solution111 instance = new Solution111();
        int expResult = 0;
        int result = instance.minDepth(root);
        assertEquals(expResult, result);
        
        TreeNode p1 = new TreeNode(1);
        assertEquals(1, instance.minDepth(p1));

        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);
        assertEquals(2, instance.minDepth(p2));

        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        p3.right = new TreeNode(2);
        assertEquals(2, instance.minDepth(p3));

        TreeNode p4 = new TreeNode(1);
        p4.left = new TreeNode(2);
        p4.right = new TreeNode(2);
        p4.right.left = new TreeNode(3);
        assertEquals(2, instance.minDepth(p4));

        TreeNode p5 = new TreeNode(1);
        p5.left = new TreeNode(2);
        p5.right = new TreeNode(2);
        p5.right.right = new TreeNode(3);
        p5.right.right.right = new TreeNode(4);
        assertEquals(2, instance.minDepth(p5));
    }
}
