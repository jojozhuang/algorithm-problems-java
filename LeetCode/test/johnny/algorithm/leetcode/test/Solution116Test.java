package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution116;
import johnny.algorithm.leetcode.common.TreeLinkNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution116Test {
    
    public Solution116Test() {
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
     * Test of connect method, of class Solution116.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        TreeLinkNode root = null;
        Solution116 instance = new Solution116();
        instance.connect(root);
        
        TreeLinkNode root3 = TreeLinkNode.CreateInstance(new String[] {"1","2","3","4","5","6","7"});
        instance.connect(root3);
        assertEquals(null, root3.next);
        assertEquals(3, root3.left.next.val);
        assertEquals(null, root3.right.next);
        assertEquals(5, root3.left.left.next.val);
        assertEquals(6, root3.left.right.next.val);
        assertEquals(7,root3.right.left.next.val);
        assertEquals(null, root3.right.right.next);
    }
}
