package johnny.algorithm.leetcode.test;

import johnny.algorithm.leetcode.Solution298;
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
public class Solution298Test {
    
    public Solution298Test() {
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
     * Test of longestConsecutive method, of class Solution298.
     */
    @Test
    public void testLongestConsecutive() {
        System.out.println("longestConsecutive");
        TreeNode root = null;
        Solution298 instance = new Solution298();
        int expResult = 0;
        int result = instance.longestConsecutive(root);
        assertEquals(expResult, result);
        
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.right.left = new TreeNode(2);
        root2.right.right = new TreeNode(4);
        root2.right.right.right = new TreeNode(5);
        assertEquals(3, instance.longestConsecutive(root2));
        
        TreeNode root3 = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.right.left = new TreeNode(2);
        root3.right.left.left = new TreeNode(1);
        assertEquals(2, instance.longestConsecutive(root3));
    }
}
