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
        ListNode l11 = ListNode.createInstance(new int[]{5});
        ListNode l12 = ListNode.createInstance(new int[]{5});
        ListNode expect1 = ListNode.createInstance(new int[]{0,1});
        assertTrue(ListNode.isSame(expect1, instance.addTwoNumbers(l11,l12)));
        
        //Input: (2) + (8 -> 9)
        //Output: 0 -> 0 -> 1
        ListNode l21 = ListNode.createInstance(new int[]{2});
        ListNode l22 = ListNode.createInstance(new int[]{8,9});
        ListNode expect2 = ListNode.createInstance(new int[]{0,0,1});
        assertTrue(ListNode.isSame(expect2, instance.addTwoNumbers(l21,l22)));
        
        //Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        //Output: 7 -> 0 -> 8
        ListNode l31 = ListNode.createInstance(new int[]{2,4,3});
        ListNode l32 = ListNode.createInstance(new int[]{5,6,4});
        ListNode expect3 = ListNode.createInstance(new int[]{7,0,8});
        assertTrue(ListNode.isSame(expect3, instance.addTwoNumbers(l31,l32)));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
