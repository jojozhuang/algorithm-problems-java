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
        Solution298 instance = new Solution298();

        assertEquals(0, instance.longestConsecutive(null));
        
        TreeNode root4 = TreeNode.createInstance(new String[] {"1","#","3","2","4","#","#","#","5"});
        assertEquals(3, instance.longestConsecutive(root4));
        
        TreeNode root3 = TreeNode.createInstance(new String[] {"2","#","3","2","#","1","#"});
        assertEquals(2, instance.longestConsecutive(root3));
    }
}
