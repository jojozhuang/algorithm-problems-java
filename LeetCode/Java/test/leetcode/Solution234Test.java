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
public class Solution234Test {
    
    public Solution234Test() {
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
     * Test of isPalindrome method, of class Solution234.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        ListNode head = null;
        Solution234 instance = new Solution234();
        boolean expResult = true;
        boolean result = instance.isPalindrome(head);
        assertEquals(expResult, result);
        
        ListNode node2 = new ListNode(1);
        assertEquals(true, instance.isPalindrome(node2));

        ListNode node3 = new ListNode(3);
        node3.next = new ListNode(1);
        assertEquals(false, instance.isPalindrome(node3));
        
        ListNode node4 = new ListNode(3);
        node4.next = new ListNode(1);
        node4.next.next = new ListNode(2);
        assertEquals(false, instance.isPalindrome(node4));
        
        ListNode node5 = new ListNode(4);
        node5.next = new ListNode(3);
        node5.next.next = new ListNode(4);
        assertEquals(true, instance.isPalindrome(node5));
        
        ListNode node6 = new ListNode(1);
        node6.next = new ListNode(1);
        node6.next.next = new ListNode(2);
        node6.next.next.next = new ListNode(1);
        assertEquals(false, instance.isPalindrome(node6));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
