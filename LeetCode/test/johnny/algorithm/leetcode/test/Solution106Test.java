package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution106;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution106Test {
    
    public Solution106Test() {
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
     * Test of buildTree method, of class Solution106.
     */
    @Test
    public void testBuildTree() {
        System.out.println("buildTree");
        Solution106 instance = new Solution106();

        assertEquals(null, instance.buildTree(null, null));
        
        TreeNode result1 = instance.buildTree(new int[]{1}, new int[]{1});
        TreeNode expect1 = TreeNode.createInstance(new String[]{"1"});
        assertTrue(TreeNode.isSame(result1, expect1));
        
        TreeNode result2 = instance.buildTree(new int[]{2,1}, new int[]{2,1});
        TreeNode expect2 = TreeNode.createInstance(new String[]{"1","2","#"});
        assertTrue(TreeNode.isSame(result2, expect2));
        
        TreeNode result3 = instance.buildTree(new int[] {1,2,3,4}, new int[] {1,3,4,2});
        TreeNode expect3 = TreeNode.createInstance(new String[]{"2","1","4","#","#","3","#"});
        assertTrue(TreeNode.isSame(result3, expect3));

        TreeNode result4 = instance.buildTree(new int[] {4,2,5,1,6,3,7}, new int[] {4,5,2,6,7,3,1});
        TreeNode expect4 = TreeNode.createInstance(new String[]{"1","2","3","4","5","6","7"});
        assertTrue(TreeNode.isSame(result4, expect4));
    }
}
