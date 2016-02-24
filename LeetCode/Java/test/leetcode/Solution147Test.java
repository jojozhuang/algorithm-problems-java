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
public class Solution147Test {
    
    public Solution147Test() {
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
     * Test of insertionSortList method, of class Solution147.
     */
    @Test
    public void testInsertionSortList() {
        System.out.println("insertionSortList");
        ListNode head = null;
        Solution147 instance = new Solution147();
        ListNode expResult = null;
        ListNode result = instance.insertionSortList(head);
        assertEquals(expResult, result);
        
        ListNode node2 = new ListNode(1);
        ListNode result2 = instance.insertionSortList(node2);
        assertEquals(1, result2.val);
        assertEquals(null, result2.next);

        ListNode node3 = new ListNode(3);
        node3.next = new ListNode(1);
        ListNode result3 = instance.insertionSortList(node3);
        assertEquals(1, result3.val);
        assertEquals(3, result3.next.val);
        assertEquals(null, result3.next.next);
        
        ListNode node4 = new ListNode(3);
        node4.next = new ListNode(1);
        node4.next.next = new ListNode(2);
        ListNode result4 = instance.insertionSortList(node4);
        assertEquals(1, result4.val);
        assertEquals(2, result4.next.val);
        assertEquals(3, result4.next.next.val);
        assertEquals(null, result4.next.next.next);
        
        ListNode node5 = new ListNode(3);
        node5.next = new ListNode(4);
        node5.next.next = new ListNode(1);
        ListNode result5 = instance.insertionSortList(node5);
        assertEquals(1, result5.val);
        assertEquals(3, result5.next.val);
        assertEquals(4, result5.next.next.val);
        assertEquals(null, result5.next.next.next);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
