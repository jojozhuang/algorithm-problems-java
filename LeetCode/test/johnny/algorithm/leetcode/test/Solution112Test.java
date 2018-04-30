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
        Solution112 instance = new Solution112();

        assertEquals(false, instance.hasPathSum(null, 0));
        
        TreeNode root1 = new TreeNode(1);
        assertEquals(false, instance.hasPathSum(root1, 2));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(true, instance.hasPathSum(root2, 3));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","2"});
        assertEquals(false, instance.hasPathSum(root3, 4));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","2","#","#","#","3"});
        assertEquals(true, instance.hasPathSum(root4, 6));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","2","#","#","#","3","#","4"});
        assertEquals(true, instance.hasPathSum(root5, 10));
        
        TreeNode root6 = TreeNode.createInstance(new String[] {"-2","#","-3"});
        assertEquals(true, instance.hasPathSum(root6, -5));
    }
}
