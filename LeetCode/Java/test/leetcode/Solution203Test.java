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
public class Solution203Test {
    
    public Solution203Test() {
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
     * Test of removeElements method, of class Solution203.
     */
    @Test
    public void testRemoveElements() {
        System.out.println("removeElements");
        ListNode head = null;
        int val = 0;
        Solution203 instance = new Solution203();
        ListNode expResult = null;
        ListNode result = instance.removeElements(head, val);
        assertEquals(expResult, result);
        
        ListNode head2 = new ListNode(1);
        ListNode result2 = instance.removeElements(head2, 2);
        assertEquals(head2.val, result2.val);
        
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        ListNode result3 = instance.removeElements(head3, 1);
        assertEquals(2, result3.val);
        assertEquals(null, result3.next);
        
        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);
        head4.next.next = new ListNode(3);         
        ListNode result4 = instance.removeElements(head4,2);
        assertEquals(1, result4.val);
        assertEquals(3, result4.next.val);
        assertEquals(null, result4.next.next);

        ListNode head5 = new ListNode(1);
        head5.next = new ListNode(5);
        head5.next.next = new ListNode(5);
        head5.next.next.next = new ListNode(4);
        head5.next.next.next.next = new ListNode(5);
        head5.next.next.next.next.next = new ListNode(6);
        ListNode result5 = instance.removeElements(head5, 5);
        assertEquals(1, result5.val);
        assertEquals(4, result5.next.val);
        assertEquals(6, result5.next.next.val);
        assertEquals(null, result5.next.next.next);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
