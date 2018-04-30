package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution333;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution333Test {
    
    public Solution333Test() {
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
     * Test of largestBSTSubtree method, of class Solution333.
     */
    @Test
    public void testLargestBSTSubtree() {
        System.out.println("largestBSTSubtree");
        Solution333 instance = new Solution333();

        assertEquals(0, instance.largestBSTSubtree(null));

        TreeNode root2 = TreeNode.createInstance(new String[]{"10","5","15","1","8","#","7"});
        assertEquals(3, instance.largestBSTSubtree(root2));
    }
}
