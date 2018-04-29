package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution099;
import johnny.algorithm.leetcode.common.TreeNode;

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
    }
}
