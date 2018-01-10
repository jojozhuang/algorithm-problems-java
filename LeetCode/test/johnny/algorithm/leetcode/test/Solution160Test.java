package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution160;
import johnny.algorithm.leetcode.common.ListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution160Test {
    
    public Solution160Test() {
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
     * Test of getIntersectionNode method, of class Solution160.
     */
    @Test
    public void testGetIntersectionNode() {
        System.out.println("getIntersectionNode");
        Solution160 instance = new Solution160();

        assertEquals(null, instance.getIntersectionNode(null, null));
        
        ListNode headA1 = ListNode.createInstance(new int[]{1});
        ListNode headB1 = ListNode.createInstance(new int[]{1});
        ListNode expect1 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect1, instance.getIntersectionNode(headA1, headB1)));
        
        ListNode headA2 = ListNode.createInstance(new int[]{1});
        ListNode headB2 = ListNode.createInstance(new int[]{1,2});
        ListNode expect2 = null;
        assertTrue(ListNode.isSame(expect2, instance.getIntersectionNode(headA2, headB2)));
        
        ListNode headA3 = ListNode.createInstance(new int[]{1,2,11,12,13});
        ListNode headB3 = ListNode.createInstance(new int[]{3,4,5,11,12,13});
        ListNode expect3 = ListNode.createInstance(new int[]{11,12,13});
        assertTrue(ListNode.isSame(expect3, instance.getIntersectionNode(headA3, headB3)));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
