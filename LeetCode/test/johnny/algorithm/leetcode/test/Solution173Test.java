package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution173;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution173Test {
    
    public Solution173Test() {
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
     * Test of next method, of class Solution173.
     */
    @Test
    public void testTreeIterator() {
        System.out.println("treeIterator");
        TreeNode root = new TreeNode(1);
        Solution173 instance = new Solution173(root);
        assertEquals(1, instance.next());
        
        TreeNode root1 = TreeNode.createInstance(new String[] {"1","#","2","#","3"});
        Solution173 instance1 = new Solution173(root1);
        assertEquals(true, instance1.hasNext());
        assertEquals(1, instance1.next());
        assertEquals(2, instance1.next());
        assertEquals(true, instance1.hasNext());
        assertEquals(3, instance1.next());
        assertEquals(false, instance1.hasNext());
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"4","2","#","1","3"});
        Solution173 instance2 = new Solution173(root2);
        assertEquals(1, instance2.next());
        assertEquals(2, instance2.next());
        assertEquals(3, instance2.next());
        assertEquals(true, instance2.hasNext());
        assertEquals(4, instance2.next());
        assertEquals(false, instance1.hasNext());
    }
}
