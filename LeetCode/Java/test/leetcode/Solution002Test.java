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
public class Solution002Test {
    
    public Solution002Test() {
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
     * Test of addTwoNumbers method, of class Solution002.
     */
    @Test
    public void testAddTwoNumbers() {
        System.out.println("addTwoNumbers");
        Solution002 instance = new Solution002();

        //Input: (5) + (5)
        //Output: 0 -> 1
        ListNode nodeOne1 = new ListNode(5);
        ListNode nodeOne2 = new ListNode(5);
        ListNode expResultOne= new ListNode(0);
        ListNode expResultOne2 = new ListNode(1);
        ListNode resultOne = instance.addTwoNumbers(nodeOne1, nodeOne2);
        assertEquals(expResultOne.val, resultOne.val);
        assertEquals(expResultOne2.val, resultOne.next.val);
        
        //Input: (2) + (8 -> 9)
        //Output: 0 -> 0 -> 1
        ListNode nodeTwo1 = new ListNode(2);
        ListNode nodeTwo2 = new ListNode(8);
        ListNode nodeTwo3 = new ListNode(9);
        nodeTwo2.next = nodeTwo3;
        ListNode expResultTwo= new ListNode(0);
        ListNode expResultTwo2 = new ListNode(0);
        ListNode expResultTwo3 = new ListNode(1);
        ListNode resultTwo = instance.addTwoNumbers(nodeTwo1, nodeTwo2);
        assertEquals(expResultTwo.val, resultTwo.val);
        assertEquals(expResultTwo2.val, resultTwo.next.val);
        assertEquals(expResultTwo3.val, resultTwo.next.next.val);
        
        //Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        //Output: 7 -> 0 -> 8
        ListNode l1 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l1.next = l12;
        l12.next = l13;
        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l2.next = l22;
        l22.next = l23;
        ListNode expResult = new ListNode(7);
        ListNode expResult2 = new ListNode(0);
        ListNode expResult3 = new ListNode(8);
        expResult.next = expResult2;
        expResult2.next = expResult3;
        ListNode result = instance.addTwoNumbers(l1, l2);
        assertEquals(expResult.val, result.val);
        assertEquals(expResult2.val, result.next.val);
        assertEquals(expResult3.val, result.next.next.val);        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addTwoNumbers2 method, of class Solution002.
     */
    @Test
    public void testAddTwoNumbers2() {
        System.out.println("addTwoNumbers2");
        Solution002 instance = new Solution002();
        
         //Input: (5) + (5)
        //Output: 0 -> 1
        ListNode nodeOne1 = new ListNode(5);
        ListNode nodeOne2 = new ListNode(5);
        ListNode expResultOne= new ListNode(0);
        ListNode expResultOne2 = new ListNode(1);
        ListNode resultOne = instance.addTwoNumbers2(nodeOne1, nodeOne2);
        assertEquals(expResultOne.val, resultOne.val);
        assertEquals(expResultOne2.val, resultOne.next.val);
        
        //Input: (2) + (8 -> 9)
        //Output: 0 -> 0 -> 1
        ListNode nodeTwo1 = new ListNode(2);
        ListNode nodeTwo2 = new ListNode(8);
        ListNode nodeTwo3 = new ListNode(9);
        nodeTwo2.next = nodeTwo3;
        ListNode expResultTwo= new ListNode(0);
        ListNode expResultTwo2 = new ListNode(0);
        ListNode expResultTwo3 = new ListNode(1);
        ListNode resultTwo = instance.addTwoNumbers2(nodeTwo1, nodeTwo2);
        assertEquals(expResultTwo.val, resultTwo.val);
        assertEquals(expResultTwo2.val, resultTwo.next.val);
        assertEquals(expResultTwo3.val, resultTwo.next.next.val);
        
        //Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        //Output: 7 -> 0 -> 8
        ListNode l1 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l1.next = l12;
        l12.next = l13;
        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l2.next = l22;
        l22.next = l23;
        ListNode expResult = new ListNode(7);
        ListNode expResult2 = new ListNode(0);
        ListNode expResult3 = new ListNode(8);
        expResult.next = expResult2;
        expResult2.next = expResult3;
        ListNode result = instance.addTwoNumbers2(l1, l2);
        assertEquals(expResult.val, result.val);
        assertEquals(expResult2.val, result.next.val);
        assertEquals(expResult3.val, result.next.next.val);  
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
