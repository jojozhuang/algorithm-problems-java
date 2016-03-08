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
public class Solution328Test {
    
    public Solution328Test() {
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
     * Test of oddEvenList method, of class Solution328.
     */
    @Test
    public void testOddEvenList() {
        System.out.println("oddEvenList");
        ListNode head = null;
        Solution328 instance = new Solution328();
        ListNode expResult = null;
        ListNode result = instance.oddEvenList(head);
        assertEquals(expResult, result);
        
        ListNode head2 = new ListNode(1);
        ListNode result2 = instance.oddEvenList(head2);
        assertEquals(1, result2.val);
        
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        ListNode result3 = instance.oddEvenList(head3);
        assertEquals(1, result3.val);
        assertEquals(2, result3.next.val);
        
        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);
        head4.next.next = new ListNode(3);
        ListNode result4 = instance.oddEvenList(head4);
        assertEquals(1, result4.val);
        assertEquals(3, result4.next.val);
        assertEquals(2, result4.next.next.val);
        
        ListNode head5 = new ListNode(1);
        head5.next = new ListNode(2);
        head5.next.next = new ListNode(3);
        head5.next.next.next = new ListNode(4);
        head5.next.next.next.next = new ListNode(5);
        ListNode result5 = instance.oddEvenList(head5);
        assertEquals(1, result5.val);
        assertEquals(3, result5.next.val);
        assertEquals(5, result5.next.next.val);
        assertEquals(2, result5.next.next.next.val);
        assertEquals(4, result5.next.next.next.next.val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
