package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution222;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution222Test {
    
    public Solution222Test() {
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
     * Test of countNodes method, of class Solution222.
     */
    @Test
    public void testCountNodes() {
        System.out.println("countNodes");
        Solution222 instance = new Solution222();

        assertEquals(0, instance.countNodes(null));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(2, instance.countNodes(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals(3, instance.countNodes(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","3","4","#","#","#"});
        assertEquals(4, instance.countNodes(root4));
    }
}
