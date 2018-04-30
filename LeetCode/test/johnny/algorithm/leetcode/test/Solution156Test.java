package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution156;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution156Test {
    
    public Solution156Test() {
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
     * Test of upsideDownBinaryTree method, of class Solution156.
     */
    @Test
    public void testUpsideDownBinaryTree() {
        System.out.println("upsideDownBinaryTree");
        Solution156 instance = new Solution156();
 
        assertEquals(null, instance.upsideDownBinaryTree(null));
        TreeNode expect2 = TreeNode.createInstance(new String[] {"4","5","2","#","#","3","1"});
        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","3","4","5"});
        assertTrue(TreeNode.isSame(expect2, instance.upsideDownBinaryTree(root2)));
    }
}
