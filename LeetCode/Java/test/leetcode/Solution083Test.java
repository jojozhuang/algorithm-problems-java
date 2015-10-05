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
public class Solution083Test {
    
    public Solution083Test() {
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
     * Test of deleteDuplicates method, of class Solution083.
     */
    @Test
    public void testDeleteDuplicates() {
        System.out.println("deleteDuplicates");
        ListNode head = null;
        Solution083 instance = new Solution083();
        ListNode expResult = null;
        ListNode result = instance.deleteDuplicates(head);
        assertEquals(expResult, result);
        
        ListNode head21 = new ListNode(1);
        ListNode head22 = new ListNode(1);
        head21.next = head22;
        ListNode result2 = instance.deleteDuplicates(head21);
        assertEquals(head22.val, result2.val);
        assertEquals(head22.next, result2.next);
        
        ListNode head31 = new ListNode(1);
        ListNode head32 = new ListNode(1);
        ListNode head33 = new ListNode(2);
        head31.next = head32;
        head32.next = head33;
        ListNode result3 = instance.deleteDuplicates(head31);
        assertEquals(head31.val, result3.val);
        assertEquals(head33.val, result3.next.val);
        
        ListNode head41 = new ListNode(1);
        ListNode head42 = new ListNode(1);
        ListNode head43 = new ListNode(2);
        ListNode head44 = new ListNode(3);
        ListNode head45 = new ListNode(3);
        head41.next = head42;
        head42.next = head43;
        head43.next = head44;
        head44.next = head45;
        ListNode result4 = instance.deleteDuplicates(head41);
        assertEquals(head41.val, result4.val);
        assertEquals(head43.val, result4.next.val);
        assertEquals(head44.val, result4.next.next.val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
