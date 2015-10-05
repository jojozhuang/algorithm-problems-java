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
public class Solution019Test {
    
    public Solution019Test() {
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
     * Test of removeNthFromEnd method, of class Solution019.
     */
    @Test
    public void testRemoveNthFromEnd() {
        System.out.println("removeNthFromEnd");
        Solution019 instance = new Solution019();
        
        //1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next  = new ListNode(2); 
        head.next.next  = new ListNode(3); 
        head.next.next.next  = new ListNode(4); 
        head.next.next.next.next  = new ListNode(5); 
        int n = 1;
        ListNode ret = new ListNode(1);
        ret.next  = new ListNode(2); 
        ret.next.next  = new ListNode(3); 
        ret.next.next.next  = new ListNode(4); 
        ListNode expResult = ret;
        ListNode result = instance.removeNthFromEnd(head, n);
        assertEquals(expResult.val, result.val);
        assertEquals(expResult.next.val, result.next.val);
        assertEquals(expResult.next.next.val, result.next.next.val);
        assertEquals(expResult.next.next.next.val, result.next.next.next.val);       
        
        n = 2;
        ListNode ret2 = new ListNode(1);
        ret2.next  = new ListNode(2); 
        ret2.next.next  = new ListNode(3); 
        ret2.next.next.next  = new ListNode(5); 
        ListNode expResult2 = ret2;
        ListNode result2 = instance.removeNthFromEnd(head, n);
        assertEquals(expResult2.val, result2.val);
        assertEquals(expResult2.next.val, result2.next.val);
        assertEquals(expResult2.next.next.val, result2.next.next.val);
        assertEquals(expResult2.next.next.next.val, result2.next.next.next.val); 
        
        // 1 , 1
        ListNode result3 = instance.removeNthFromEnd(new ListNode(1), 1);
        assertEquals(null, result3);
        
        //Input:	{1,2,3}, 3
        n=3;
        ListNode head4 = new ListNode(1);
        head.next  = new ListNode(2); 
        head.next.next  = new ListNode(3); 
        ListNode ret4 = new ListNode(2);
        ret4.next  = new ListNode(3); 
        ListNode expResult4 = ret4;
        ListNode result4 = instance.removeNthFromEnd(head, n);
        assertEquals(expResult4.val, result4.val);
        assertEquals(expResult4.next.val, result4.next.val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
