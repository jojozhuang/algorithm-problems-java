package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution142;
import johnny.algorithm.leetcode.common.ListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution142Test {
    
    public Solution142Test() {
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
     * Test of detectCycle method, of class Solution142.
     */
    @Test
    public void testDetectCycle() {
        System.out.println("detectCycle");
        Solution142 instance = new Solution142();
        
        //Input: 1 -> 2 -> 3
        ListNode head2 = ListNode.createInstance(new int[]{1,2,3});
        assertEquals(null, instance.detectCycle(head2));

        //Input: 1 -> 2 -> 3, 3 -> head 1
        ListNode head3 = ListNode.createInstance(new int[]{1,2,3});
        head3.next.next.next = head3;
        assertEquals(head3, instance.detectCycle(head3));
    }
}
