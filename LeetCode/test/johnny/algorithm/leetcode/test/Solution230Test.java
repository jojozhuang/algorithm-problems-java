package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution230;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution230Test {
    
    public Solution230Test() {
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
     * Test of kthSmallest method, of class Solution230.
     */
    @Test
    public void testKthSmallest() {
        System.out.println("kthSmallest");
        TreeNode root = null;
        int k = 0;
        Solution230 instance = new Solution230();
        int expResult = Integer.MIN_VALUE;
        int result = instance.kthSmallest(root, k);
        assertEquals(expResult, result);
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"2","1", "#"});
        assertEquals(1, instance.kthSmallest(root2, 1));
        TreeNode root3 = TreeNode.createInstance(new String[] {"2","1", "#"});
        assertEquals(2, instance.kthSmallest(root3, 2));
        
        TreeNode root4 = TreeNode.createInstance(new String[] {"4","2","7","#", "3", "5", "#","#","#","#","6","#","#"});
        assertEquals(2, instance.kthSmallest(root4, 1));
        TreeNode root5 = TreeNode.createInstance(new String[] {"4","2","7","#", "3", "5", "#","#","#","#","6","#","#"});
        assertEquals(3, instance.kthSmallest(root5, 2));
        TreeNode root6 = TreeNode.createInstance(new String[] {"4","2","7","#", "3", "5", "#","#","#","#","6","#","#"});
        assertEquals(4, instance.kthSmallest(root6, 3));
        TreeNode root7 = TreeNode.createInstance(new String[] {"4","2","7","#", "3", "5", "#","#","#","#","6","#","#"});
        assertEquals(5, instance.kthSmallest(root7, 4));
        TreeNode root8 = TreeNode.createInstance(new String[] {"4","2","7","#", "3", "5", "#","#","#","#","6","#","#"});
        assertEquals(6, instance.kthSmallest(root8, 5));
        TreeNode root9 = TreeNode.createInstance(new String[] {"4","2","7","#", "3", "5", "#","#","#","#","6","#","#"});
        assertEquals(7, instance.kthSmallest(root9, 6));
    }
}
