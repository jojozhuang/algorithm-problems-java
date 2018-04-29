package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution086;
import johnny.algorithm.leetcode.common.ListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution086Test {
    
    public Solution086Test() {
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
     * Test of partition method, of class Solution086.
     */
    @Test
    public void testPartition() {
        System.out.println("partition");
        Solution086 instance = new Solution086();

        assertEquals(null, instance.partition(null, 0));
        
        ListNode head2 = ListNode.createInstance(new int[]{1,3,2});
        ListNode expect2 = ListNode.createInstance(new int[]{1,3,2});
        assertTrue(ListNode.isSame(expect2, instance.partition(head2,2)));
        
        ListNode head3 = ListNode.createInstance(new int[]{1,4,3,2,5,2});
        ListNode expect3 = ListNode.createInstance(new int[]{1,2,2,4,3,5});
        assertTrue(ListNode.isSame(expect3, instance.partition(head3,3)));
    }
}
