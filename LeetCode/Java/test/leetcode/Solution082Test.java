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
public class Solution082Test {
    
    public Solution082Test() {
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
     * Test of deleteDuplicates method, of class Solution082.
     */
    @Test
    public void testDeleteDuplicates() {
        System.out.println("deleteDuplicates");
        ListNode head = null;
        Solution082 instance = new Solution082();
        ListNode expResult = null;
        ListNode result = instance.deleteDuplicates(head);
        assertEquals(expResult, result);
        
        ListNode head1 = new ListNode(1);       
        head1.next = new ListNode(2);  
        head1.next.next =  new ListNode(3);  
        ListNode result1 = instance.deleteDuplicates(head1);
        assertEquals(head1.val, result1.val);
        assertEquals(head1.next.val, result1.next.val);
        assertEquals(head1.next.next.val, result1.next.next.val);
        
        ListNode head2 = new ListNode(1);       
        head2.next = new ListNode(1);  
        head2.next.next =  new ListNode(2);  
        ListNode result2 = instance.deleteDuplicates(head2);
        assertEquals(2, result2.val);
        assertEquals(null, result2.next);
        
        ListNode head3 = new ListNode(1);       
        head3.next = new ListNode(1);  
        head3.next.next =  new ListNode(1);  
        head3.next.next.next =  new ListNode(2);  
        head3.next.next.next.next =  new ListNode(3);  
        ListNode result3 = instance.deleteDuplicates(head3);
        assertEquals(2, result3.val);
        assertEquals(3, result3.next.val);
        assertEquals(null, result3.next.next);
        
        ListNode head4 = new ListNode(1);       
        head4.next = new ListNode(2);  
        head4.next.next =  new ListNode(3);  
        head4.next.next.next =  new ListNode(3);  
        head4.next.next.next.next =  new ListNode(4);  
        head4.next.next.next.next.next =  new ListNode(4);  
        head4.next.next.next.next.next.next =  new ListNode(5);  
        ListNode result4 = instance.deleteDuplicates(head4);
        assertEquals(1, result4.val);
        assertEquals(2, result4.next.val);
        assertEquals(5, result4.next.next.val);
        assertEquals(null, result4.next.next.next);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
