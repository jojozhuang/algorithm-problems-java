package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution404;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution404Test {
    
    public Solution404Test() {
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
     * Test of sumOfLeftLeaves method, of class Solution404.
     */
    @Test
    public void testSumOfLeftLeaves() {
        System.out.println("sumOfLeftLeaves");
        Solution404 instance = new Solution404();
        TreeNode r1 = new TreeNode(1);
        assertEquals(0, instance.sumOfLeftLeaves(r1));
        
        TreeNode r2 = TreeNode.createInstance(new String[] {"3","9", "20"});
        assertEquals(9, instance.sumOfLeftLeaves(r2));
        
        TreeNode r3 = TreeNode.createInstance(new String[] {"3","9", "20", "#","#","15","7"});
        assertEquals(24, instance.sumOfLeftLeaves(r3));
    }
}
