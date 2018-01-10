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
        
        TreeNode root1 = new TreeNode(1);
        instance = new Solution114();
        instance.flatten(root1);
        assertEquals(1, root1.val);
        
        /*TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        instance = new Solution114();
        instance.flatten(root2);
        assertEquals(1, root2.val);
        assertEquals(2, root2.right.val);
        
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        instance = new Solution114();
        instance.flatten(root3);
        assertEquals(1, root3.val);
        assertEquals(2, root3.right.val);
        assertEquals(3, root3.right.right.val);
        
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(3);
        root4.left.right = new TreeNode(4);
        root4.right = new TreeNode(5);
        root4.right.left = new TreeNode(6);
        instance = new Solution114();
        instance.flatten(root4);
        assertEquals(1, root4.val);
        assertEquals(2, root4.right.val);
        assertEquals(3, root4.right.right.val);
        assertEquals(4, root4.right.right.right.val);
        assertEquals(5, root4.right.right.right.right.val);
        assertEquals(6, root4.right.right.right.right.right.val);
        
        TreeNode root5 = new TreeNode(2);
        root5.left = new TreeNode(1);
        root5.right = new TreeNode(4);
        root5.right.left = new TreeNode(3);
        instance = new Solution114();
        instance.flatten(root5);
        assertEquals(2, root5.val);
        assertEquals(1, root5.right.val);
        assertEquals(4, root5.right.right.val);
        assertEquals(3, root5.right.right.right.val);*/
        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","#"});
        instance = new Solution114();
        instance.flatten(root2);
        assertEquals(1, root2.val);
        assertEquals(2, root2.right.val);
        
        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","3"});
        instance = new Solution114();
        instance.flatten(root3);
        assertEquals(1, root3.val);
        assertEquals(2, root3.right.val);
        assertEquals(3, root3.right.right.val);
        
        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","5","3","4","6","#"});
        instance = new Solution114();
        instance.flatten(root4);
        assertEquals(1, root4.val);
        assertEquals(2, root4.right.val);
        assertEquals(3, root4.right.right.val);
        assertEquals(4, root4.right.right.right.val);
        assertEquals(5, root4.right.right.right.right.val);
        assertEquals(6, root4.right.right.right.right.right.val);
        
        TreeNode root5 = TreeNode.createInstance(new String[] {"2","1","4","#","#","3","#"});
        instance = new Solution114();
        instance.flatten(root5);
        assertEquals(2, root5.val);
        assertEquals(1, root5.right.val);
        assertEquals(4, root5.right.right.val);
        assertEquals(3, root5.right.right.right.val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
