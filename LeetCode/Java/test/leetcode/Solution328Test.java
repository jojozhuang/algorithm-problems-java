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
public class Solution328Test {
    
    public Solution328Test() {
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
     * Test of oddEvenList method, of class Solution328.
     */
    @Test
    public void testOddEvenList() {
        System.out.println("oddEvenList");
        Solution328 instance = new Solution328();

        assertEquals(null, instance.oddEvenList(null));
        
        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.oddEvenList(head2)));
                
        ListNode head3 = ListNode.createInstance(new int[]{1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{1,2});
        assertTrue(ListNode.isSame(expect3, instance.oddEvenList(head3)));
        
        ListNode head4 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect4 = ListNode.createInstance(new int[]{1,3,2});
        assertTrue(ListNode.isSame(expect4, instance.oddEvenList(head4)));
        
        ListNode head5 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect5 = ListNode.createInstance(new int[]{1,3,5,2,4});
        assertTrue(ListNode.isSame(expect5, instance.oddEvenList(head5)));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
