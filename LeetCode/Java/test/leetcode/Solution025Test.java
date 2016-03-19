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
public class Solution025Test {
    
    public Solution025Test() {
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
     * Test of reverseKGroup method, of class Solution025.
     */
    @Test
    public void testReverseKGroup() {
        System.out.println("reverseKGroup");
        ListNode head = null;
        int k = 0;
        Solution025 instance = new Solution025();
        ListNode expResult = null;
        ListNode result = instance.reverseKGroup(head, k);
        assertEquals(expResult, result);
        
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        ListNode result2 = instance.reverseKGroup(head2, 2);
        assertEquals(2, result2.val);
        assertEquals(1, result2.next.val);
        assertEquals(4, result2.next.next.val);
        assertEquals(3, result2.next.next.next.val);
        assertEquals(5, result2.next.next.next.next.val);
        
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(3);
        head3.next.next.next = new ListNode(4);
        head3.next.next.next.next = new ListNode(5);
        ListNode result3 = instance.reverseKGroup(head3, 3);
        assertEquals(3, result3.val);
        assertEquals(2, result3.next.val);
        assertEquals(1, result3.next.next.val);
        assertEquals(4, result3.next.next.next.val);
        assertEquals(5, result3.next.next.next.next.val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
