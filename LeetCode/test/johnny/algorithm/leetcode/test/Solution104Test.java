package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution104;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution104Test {
    
    public Solution104Test() {
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
     * Test of maxDepth method, of class Solution104.
     */
    @Test
    public void testMaxDepth() {
        System.out.println("maxDepth");
        Solution104 instance = new Solution104();

        assertEquals(0, instance.maxDepth(null));

        TreeNode root1 = new TreeNode(1);
        assertEquals(1, instance.maxDepth(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(2, instance.maxDepth(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","2"});
        assertEquals(2, instance.maxDepth(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","2","#","#","3","#"});
        assertEquals(3, instance.maxDepth(root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","2","#","#","#","3","#","4"});
        assertEquals(4, instance.maxDepth(root5));
    }
}
