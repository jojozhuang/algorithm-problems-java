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
public class Solution143Test {
    
    public Solution143Test() {
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
     * Test of reorderList method, of class Solution143.
     */
    @Test
    public void testReorderList() {
        System.out.println("reorderList");
        ListNode head = null;
        Solution143 instance = new Solution143();
        instance.reorderList(head);
        assertEquals(null, head);
        
        ListNode head2 = new ListNode(1);
        instance.reorderList(head2);
        assertEquals(1, head2.val);
        assertEquals(null, head2.next);
        
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        instance.reorderList(head3);
        assertEquals(1, head3.val);
        assertEquals(2, head3.next.val);
        assertEquals(null, head3.next.next);
        
        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);
        head4.next.next = new ListNode(3);
        instance.reorderList(head4);
        assertEquals(1, head4.val);
        assertEquals(3, head4.next.val);
        assertEquals(2, head4.next.next.val);
        
        ListNode head5 = new ListNode(1);
        head5.next = new ListNode(2);
        head5.next.next = new ListNode(3);
        head5.next.next.next = new ListNode(4);
        instance.reorderList(head5);
        assertEquals(1, head5.val);
        assertEquals(4, head5.next.val);
        assertEquals(2, head5.next.next.val);
        assertEquals(3, head5.next.next.next.val);
        
        ListNode head6 = new ListNode(1);
        head6.next = new ListNode(2);
        head6.next.next = new ListNode(3);
        head6.next.next.next = new ListNode(4);
        head6.next.next.next.next = new ListNode(5);
        instance.reorderList(head6);
        assertEquals(1, head6.val);
        assertEquals(5, head6.next.val);
        assertEquals(2, head6.next.next.val);
        assertEquals(4, head6.next.next.next.val);
        assertEquals(3, head6.next.next.next.next.val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
