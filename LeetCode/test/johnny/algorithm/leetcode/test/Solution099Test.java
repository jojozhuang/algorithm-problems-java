package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution099;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;
/**
 *
 * @author Johnny
 */
public class Solution099Test {
    
    public Solution099Test() {
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
     * Test of recoverTree method, of class Solution099.
     */
    @Test
    public void testRecoverTree() {
        System.out.println("recoverTree");
        TreeNode root = null;
        Solution099 instance = new Solution099();
        instance.recoverTree(root);
        assertEquals(null, root);
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"1","3","#","#","2"});
        TreeNode expect2 = TreeNode.createInstance(new String[] {"3","1","#","#","2"});
        instance.recoverTree(root2);
        assertTrue(TreeNode.isSame(expect2, root2));

        Solution099 instance2 = new Solution099();
        TreeNode root3 = TreeNode.createInstance(new String[] {"3","1","4","#","#","2","#"});
        TreeNode expect3 = TreeNode.createInstance(new String[] {"2","1","4","#","#","3","#"});
        instance2.recoverTree(root3);
        assertTrue(TreeNode.isSame(expect3, root3));
    }
}
