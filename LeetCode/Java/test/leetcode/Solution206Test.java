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
public class Solution206Test {
    
    public Solution206Test() {
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
     * Test of reverseList method, of class Solution206.
     */
    @Test
    public void testReverseList() {
        System.out.println("reverseList");
        ListNode head = null;
        Solution206 instance = new Solution206();
        ListNode expResult = null;
        ListNode result = instance.reverseList(head);
        assertEquals(expResult, result);
        
        //1->2->3->4->5
        ListNode head2 = new ListNode(1);
        head2.next  = new ListNode(2); 
        head2.next.next  = new ListNode(3); 
        head2.next.next.next  = new ListNode(4); 
        head2.next.next.next.next  = new ListNode(5); 
        ListNode result2 = instance.reverseList(head2);
        ListNode expResult2 = new ListNode(5);
        expResult2.next  = new ListNode(4); 
        expResult2.next.next  = new ListNode(3); 
        expResult2.next.next.next  = new ListNode(2); 
        expResult2.next.next.next.next  = new ListNode(1);  
        assertEquals(expResult2.val, result2.val);
        assertEquals(expResult2.next.val, result2.next.val);
        assertEquals(expResult2.next.next.val, result2.next.next.val);
        assertEquals(expResult2.next.next.next.val, result2.next.next.next.val);       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
