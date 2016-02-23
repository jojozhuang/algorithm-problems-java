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
public class Solution092Test {
    
    public Solution092Test() {
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
     * Test of reverseBetween method, of class Solution092.
     */
    @Test
    public void testReverseBetween() {
        System.out.println("reverseBetween");
        ListNode head = null;
        int m = 0;
        int n = 0;
        Solution092 instance = new Solution092();
        ListNode expResult = null;
        ListNode result = instance.reverseBetween(head, m, n);
        assertEquals(expResult, result);
        
        //1->2->3->4->5
        ListNode head2 = new ListNode(1);
        head2.next  = new ListNode(2); 
        head2.next.next  = new ListNode(3); 
        head2.next.next.next  = new ListNode(4); 
        head2.next.next.next.next  = new ListNode(5); 
        ListNode result2 = instance.reverseBetween(head2, 2, 4);
        assertEquals(1, result2.val);
        assertEquals(4, result2.next.val);
        assertEquals(3, result2.next.next.val);
        assertEquals(2, result2.next.next.next.val);  
        assertEquals(5, result2.next.next.next.next.val);  
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
