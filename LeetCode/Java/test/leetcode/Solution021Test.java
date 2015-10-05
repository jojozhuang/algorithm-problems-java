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
public class Solution021Test {
    
    public Solution021Test() {
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
     * Test of mergeTwoLists method, of class Solution021.
     */
    @Test
    public void testMergeTwoLists() {
        System.out.println("mergeTwoLists");
        Solution021 instance = new Solution021();
        
        //{1},{2}
        /*Solution021.ListNode l1 = instance.new ListNode(1);
        Solution021.ListNode l2 = instance.new ListNode(2);
        Solution021.ListNode l3 = l1;
        l3.next = l2;
        Solution021.ListNode expResult = l3;
        Solution021.ListNode result = instance.mergeTwoLists(l1, l2);
        assertEquals(expResult.val, result.val);
        assertEquals(expResult.next.val, result.next.val);*/
        
        //{1,3,5},{2,4,6}
        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(5);
        l21.next = l22;
        l22.next = l23;                
        ListNode l24 = new ListNode(2);
        ListNode l25 = new ListNode(4);
        ListNode l26 = new ListNode(6);
        l24.next = l25;
        l25.next = l26;
        ListNode l27 = new ListNode(1);
        l27.next = new ListNode(2);
        l27.next.next = new ListNode(3);
        l27.next.next.next = new ListNode(4);
        l27.next.next.next.next = new ListNode(5);
        l27.next.next.next.next.next = new ListNode(6);
        
        ListNode expResult2 = l27;
        ListNode result2 = instance.mergeTwoLists(l21, l24);
        do {           
            assertEquals(expResult2.val, result2.val);
            if (expResult2!=null)
                expResult2 = expResult2.next;
            if (result2!=null)
                result2 = result2.next;
        }while(expResult2!=null&&result2!=null);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
