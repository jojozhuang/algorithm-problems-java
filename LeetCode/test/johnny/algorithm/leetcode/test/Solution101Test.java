package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution101;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution101Test {
    
    public Solution101Test() {
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
     * Test of isSymmetric method, of class Solution101.
     */
    @Test
    public void testIsSymmetric() {
        System.out.println("isSymmetric");
        Solution101 instance = new Solution101();

        assertEquals(true, instance.isSymmetric(null));
        
        TreeNode p2 = new TreeNode(1);
        assertEquals(true, instance.isSymmetric(p2));

        TreeNode p3 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(false, instance.isSymmetric(p3));

        TreeNode p4 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals(false, instance.isSymmetric(p4));

        TreeNode p5 = TreeNode.createInstance(new String[] {"1","2","2"});
        assertEquals(true, instance.isSymmetric(p5));

        TreeNode p6 = TreeNode.createInstance(new String[] {"1","2","2","#","#","3","3"});
        assertEquals(false, instance.isSymmetric(p6));

        TreeNode p7 = TreeNode.createInstance(new String[] {"1","2","2","#","3","3","#"});
        assertEquals(true, instance.isSymmetric(p7));
    }
}
