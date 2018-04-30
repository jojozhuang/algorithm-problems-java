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
        Solution285 instance = new Solution285();

        assertEquals(null, instance.inorderSuccessor(null, null));
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"20","8","22","4","12","#","#","#","#","10","14"});
        TreeNode result2 = instance.inorderSuccessor(root2, root2.left);
        assertEquals(10, result2.val);
        
        TreeNode root3 = TreeNode.createInstance(new String[] {"20","8","22","4","12","#","#","#","#","10","14"});
        TreeNode result3 = instance.inorderSuccessor(root3, root3.left.right.right);
        assertEquals(20, result3.val);
        
        TreeNode root4 = TreeNode.createInstance(new String[] {"20","8","22","4","12","#","#","#","#","10","14"});
        TreeNode result4 = instance.inorderSuccessor(root4, root4.right);
        assertEquals(null, result4);
    }
}
