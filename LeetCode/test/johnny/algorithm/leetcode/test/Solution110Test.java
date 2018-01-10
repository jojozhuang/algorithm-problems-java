package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution110;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution110Test {
    
    public Solution110Test() {
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
     * Test of isBalanced method, of class Solution110.
     */
    @Test
    public void testIsBalanced() {
        System.out.println("isBalanced");
        TreeNode root = null;
        Solution110 instance = new Solution110();
        boolean expResult = true;
        boolean result = instance.isBalanced(root);
        assertEquals(expResult, result);
        
        TreeNode p1 = TreeNode.createInstance(new String[] {"1"});
        assertEquals(true, instance.isBalanced(p1));

        TreeNode p2 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(true, instance.isBalanced(p2));

        TreeNode p3 = TreeNode.createInstance(new String[] {"1","2","2"});
        assertEquals(true, instance.isBalanced(p3));

        TreeNode p4 = TreeNode.createInstance(new String[] {"1","2","2","#","#","3","#"});
        assertEquals(true, instance.isBalanced(p4));

        TreeNode p5 = TreeNode.createInstance(new String[] {"1","2","2","#","#","#","3","#","4"});
        assertEquals(false, instance.isBalanced(p5));

        TreeNode p6 = TreeNode.createInstance(new String[] {"1","2","2","3","#","#","3","4","#","#","4"});
        assertEquals(false, instance.isBalanced(p6));

        TreeNode p7 = TreeNode.createInstance(new String[] {"1","2","2","3","3","3","3","4","4","4","4","4","4","#","#","5","5","#","#","#","#","#","#","#","#","#","#","#","#"});
        assertEquals(true, instance.isBalanced(p7));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
