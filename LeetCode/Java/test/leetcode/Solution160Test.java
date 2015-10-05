/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
        ListNode headA = null;
        ListNode headB = null;
        Solution160 instance = new Solution160();
        ListNode expResult = null;
        ListNode result = instance.getIntersectionNode(headA, headB);
        assertEquals(expResult, result);
        
        ListNode headA1 = new ListNode(1);
        ListNode headB1 = new ListNode(1);
        ListNode result1 = instance.getIntersectionNode(headA1, headB1);
        assertEquals(headA1.val, result1.val);
        assertEquals(headA1.next, result1.next);
        
        ListNode headA2 = new ListNode(1);
        ListNode headB2 = new ListNode(1);
        headB2.next = new ListNode(2);
        ListNode result2 = instance.getIntersectionNode(headA2, headB2);
        assertEquals(null, result2);

        ListNode headC3 = new ListNode(11);
        headC3.next = new ListNode(12);
        headC3.next.next = new ListNode(13);
        ListNode headA3 = new ListNode(1);
        headA3.next = new ListNode(2);
        headA3.next.next = headC3;
        ListNode headB3 = new ListNode(3);
        headB3.next = new ListNode(4);
        headB3.next.next = new ListNode(5);
        headB3.next.next.next = headC3;
        ListNode result3 = instance.getIntersectionNode(headA3, headB3);
        assertEquals(headC3.val, result3.val);
        assertEquals(headC3.next, result3.next);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
