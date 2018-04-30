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
        Solution110 instance = new Solution110();

        assertEquals(true, instance.isBalanced(null));
        
        TreeNode root1 = TreeNode.createInstance(new String[] {"1"});
        assertEquals(true, instance.isBalanced(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(true, instance.isBalanced(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","2"});
        assertEquals(true, instance.isBalanced(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","2","#","#","3","#"});
        assertEquals(true, instance.isBalanced(root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","2","#","#","#","3","#","4"});
        assertEquals(false, instance.isBalanced(root5));

        TreeNode root6 = TreeNode.createInstance(new String[] {"1","2","2","3","#","#","3","4","#","#","4"});
        assertEquals(false, instance.isBalanced(root6));

        TreeNode root7 = TreeNode.createInstance(new String[] {"1","2","2","3","3","3","3","4","4","4","4","4","4","#","#","5","5","#","#","#","#","#","#","#","#","#","#","#","#"});
        assertEquals(true, instance.isBalanced(root7));
    }
}
