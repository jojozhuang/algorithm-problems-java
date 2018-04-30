package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution226;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution226Test {
    
    public Solution226Test() {
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
     * Test of invertTree method, of class Solution226.
     */
    @Test
    public void testInvertTree() {
        System.out.println("invertTree");
        Solution226 instance = new Solution226();

        assertEquals(null, instance.invertTree(null));
        
        TreeNode root1 = new TreeNode(1);
        assertEquals(root1, instance.invertTree(root1));
        
        TreeNode expect2 = TreeNode.createInstance(new String[] {"1","#","2"});
        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertTrue(TreeNode.isSame(expect2, instance.invertTree(root2)));
        
        TreeNode expect3 = TreeNode.createInstance(new String[] {"1","3","2"});
        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertTrue(TreeNode.isSame(expect3, instance.invertTree(root3)));
        
        TreeNode expect4 = TreeNode.createInstance(new String[] {"4","7","2","9","6","3","1"});
        TreeNode root4 = TreeNode.createInstance(new String[] {"4","2","7","1","3","6","9"});
        assertTrue(TreeNode.isSame(expect4, instance.invertTree(root4)));
    }
}
