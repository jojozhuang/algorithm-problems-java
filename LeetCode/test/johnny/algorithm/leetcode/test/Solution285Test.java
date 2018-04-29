package johnny.algorithm.leetcode.test;

import johnny.algorithm.leetcode.Solution285;
import johnny.algorithm.leetcode.common.TreeNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution285Test {
    
    public Solution285Test() {
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
     * Test of inorderSuccessor method, of class Solution285.
     */
    @Test
    public void testInorderSuccessor() {
        System.out.println("inorderSuccessor");
        TreeNode root = null;
        TreeNode p = null;
        Solution285 instance = new Solution285();
        TreeNode expResult = null;
        TreeNode result = instance.inorderSuccessor(root, p);
        assertEquals(expResult, result);
        
        TreeNode root2 = new TreeNode(20);
        root2.left = new TreeNode(8);
        root2.right = new TreeNode(22);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(12);
        root2.left.right.left = new TreeNode(10);
        root2.left.right.right = new TreeNode(14);
        TreeNode result2 = instance.inorderSuccessor(root2, root2.left);
        assertEquals(10, result2.val);
        TreeNode root3 = new TreeNode(20);
        root3.left = new TreeNode(8);
        root3.right = new TreeNode(22);
        root3.left.left = new TreeNode(4);
        root3.left.right = new TreeNode(12);
        root3.left.right.left = new TreeNode(10);
        root3.left.right.right = new TreeNode(14);
        TreeNode result3 = instance.inorderSuccessor(root3, root3.left.right.right);
        assertEquals(20, result3.val);
        
        TreeNode root4 = new TreeNode(20);
        root4.left = new TreeNode(8);
        root4.right = new TreeNode(22);
        root4.left.left = new TreeNode(4);
        root4.left.right = new TreeNode(12);
        root4.left.right.left = new TreeNode(10);
        root4.left.right.right = new TreeNode(14);
        TreeNode result4 = instance.inorderSuccessor(root4, root4.right);
        assertEquals(null, result4);
    }
}
