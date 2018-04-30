package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution114;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution114Test {
    
    public Solution114Test() {
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
     * Test of flatten method, of class Solution114.
     */
    @Test
    public void testFlatten() {
        System.out.println("flatten");
        TreeNode root = null;
        Solution114 instance = new Solution114();
        instance.flatten(root);
        assertEquals(null, root);
        
        TreeNode root2 = new TreeNode(1);
        TreeNode expect2 = TreeNode.createInstance(new String[] {"1","#","#"});
        Solution114 instance2 = new Solution114();
        instance2.flatten(root2);
        assertTrue(TreeNode.isSame(expect2, root2));
        
        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","#"});
        TreeNode expect3 = TreeNode.createInstance(new String[] {"1","#","2"});
        Solution114 instance3 = new Solution114();
        instance3.flatten(root3);
        assertTrue(TreeNode.isSame(expect3, root3));
        
        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","3"});
        TreeNode expect4 = TreeNode.createInstance(new String[] {"1","#","2","#","3"});
        Solution114 instance4 = new Solution114();
        instance4.flatten(root4);
        assertTrue(TreeNode.isSame(expect4, root4));
        
        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","5","3","4","6","#"});
        TreeNode expect5 = TreeNode.createInstance(new String[] {"1","#","2","#","3","#","4","#","5","#","6"});
        Solution114 instance5 = new Solution114();
        instance5.flatten(root5);
        assertTrue(TreeNode.isSame(expect5, root5));
        
        TreeNode root6 = TreeNode.createInstance(new String[] {"2","1","4","#","#","3","#"});
        TreeNode expect6 = TreeNode.createInstance(new String[] {"2","#","1","#","4","#","3"});
        Solution114 instance6 = new Solution114();
        instance6.flatten(root6);
        assertTrue(TreeNode.isSame(expect6, root6));
    }
}
