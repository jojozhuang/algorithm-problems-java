/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
public class Solution369Test {
    
    public Solution369Test() {
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
     * Test of plusOne method, of class Solution369.
     */
    @Test
    public void testPlusOne() {
        System.out.println("plusOne");
        ListNode head = null;
        Solution369 instance = new Solution369();
        ListNode expResult = new ListNode(1);
        ListNode result = instance.plusOne(head);
        assertEquals(1, result.val);
        
        //1->2->3
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        ListNode result2 = instance.plusOne(head2);
        //1->2->4
        assertEquals(1, result2.val);
        assertEquals(2, result2.next.val);
        assertEquals(4, result2.next.next.val);
        
        ListNode head3 = new ListNode(9);
        head3.next = new ListNode(9);
        head3.next.next = new ListNode(9);
        ListNode result3 = instance.plusOne(head3);
        assertEquals(1, result3.val);
        assertEquals(0, result3.next.val);
        assertEquals(0, result3.next.next.val);
        assertEquals(0, result3.next.next.next.val);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
