package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution100;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution100Test {
    
    public Solution100Test() {
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
     * Test of isSameTree method, of class Solution100.
     */
    @Test
    public void testIsSameTree() {
        System.out.println("isSameTree");
        Solution100 instance = new Solution100();

        assertEquals(true, instance.isSameTree(null, null));
        
        TreeNode p2 = new TreeNode(1);
        TreeNode q2 = null;
        assertEquals(false, instance.isSameTree(p2, q2));

        TreeNode p3 = new TreeNode(1);
        TreeNode q3 = new TreeNode(1);
        assertEquals(true, instance.isSameTree(p3, q3));

        TreeNode p4 = TreeNode.createInstance(new String[] {"1","2","#"});
        TreeNode q4 = new TreeNode(1);
        assertEquals(false, instance.isSameTree(p4, q4));

        TreeNode p5 = TreeNode.createInstance(new String[] {"1","2","#"});
        TreeNode q5 = TreeNode.createInstance(new String[] {"1","#","2"});
        assertEquals(false, instance.isSameTree(p5, q5));

        TreeNode p6 = TreeNode.createInstance(new String[] {"1","2","3"});
        TreeNode q6 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals(true, instance.isSameTree(p6, q6));
    }
}
