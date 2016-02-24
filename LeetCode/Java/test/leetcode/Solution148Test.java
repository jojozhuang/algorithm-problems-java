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
public class Solution148Test {
    
    public Solution148Test() {
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
     * Test of sortList method, of class Solution148.
     */
    @Test
    public void testSortList() {
        System.out.println("sortList");
        ListNode head = null;
        Solution148 instance = new Solution148();
        ListNode expResult = null;
        ListNode result = instance.sortList(head);
        assertEquals(expResult, result);
        
        ListNode node2 = new ListNode(1);
        ListNode result2 = instance.sortList(node2);
        assertEquals(1, result2.val);
        assertEquals(null, result2.next);

        ListNode node3 = new ListNode(3);
        node3.next = new ListNode(1);
        ListNode result3 = instance.sortList(node3);
        assertEquals(1, result3.val);
        assertEquals(3, result3.next.val);
        assertEquals(null, result3.next.next);
        
        ListNode node4 = new ListNode(3);
        node4.next = new ListNode(1);
        node4.next.next = new ListNode(2);
        ListNode result4 = instance.sortList(node4);
        assertEquals(1, result4.val);
        assertEquals(2, result4.next.val);
        assertEquals(3, result4.next.next.val);
        assertEquals(null, result4.next.next.next);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
