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
public class Solution086Test {
    
    public Solution086Test() {
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
     * Test of partition method, of class Solution086.
     */
    @Test
    public void testPartition() {
        System.out.println("partition");
        ListNode head = null;
        int x = 0;
        Solution086 instance = new Solution086();
        ListNode expResult = null;
        ListNode result = instance.partition(head, x);
        assertEquals(expResult, result);
        
        ListNode head2 = new ListNode(1);       
        head2.next = new ListNode(3);  
        head2.next.next =  new ListNode(2);  
        ListNode result2 = instance.partition(head2, 2);
        assertEquals(1, result2.val);
        assertEquals(3, result2.next.val);
        assertEquals(2, result2.next.next.val);
        assertEquals(null, result2.next.next.next);
        
        ListNode head3 = new ListNode(1);       
        head3.next = new ListNode(4);          
        head3.next.next =  new ListNode(3);  
        head3.next.next.next =  new ListNode(2);  
        head3.next.next.next.next =  new ListNode(5);  
        head3.next.next.next.next.next =  new ListNode(2);  
        ListNode result3 = instance.partition(head3, 3);
        assertEquals(1, result3.val);
        assertEquals(2, result3.next.val);
        assertEquals(2, result3.next.next.val);
        assertEquals(4, result3.next.next.next.val);
        assertEquals(3, result3.next.next.next.next.val);
        assertEquals(5, result3.next.next.next.next.next.val);
        assertEquals(null, result3.next.next.next.next.next.next);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
