package johnny.algorithm.leetcode.test;

import johnny.algorithm.leetcode.common.TreeNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution606;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution606Test {
    
    public Solution606Test() {
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
     * Test of tree2str method, of class Solution606.
     */
    @Test
    public void testTree2str() {
        System.out.println("tree2str");        
        Solution606 instance = new Solution606();

        assertEquals("", instance.tree2str(null));
        
        TreeNode t1 = TreeNode.createInstance(new String[] {"1"});
        assertEquals("1", instance.tree2str(t1));
        
        TreeNode t2 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals("1(2)(3)", instance.tree2str(t2));
        
        TreeNode t3 = TreeNode.createInstance(new String[] {"1","#","3"});
        assertEquals("1()(3)", instance.tree2str(t3));
        
        TreeNode t4 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals("1(2)", instance.tree2str(t4));
        
        TreeNode t5 = TreeNode.createInstance(new String[] {"1","2","3","4","#"});
        assertEquals("1(2(4))(3)", instance.tree2str(t5));
        
        TreeNode t6 = TreeNode.createInstance(new String[] {"1","2","3","#","4"});
        assertEquals("1(2()(4))(3)", instance.tree2str(t6));
    }
}
