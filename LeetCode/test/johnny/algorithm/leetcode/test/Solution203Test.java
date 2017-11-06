/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution203;
import johnny.algorithm.leetcode.common.ListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution203Test {
    
    public Solution203Test() {
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
     * Test of removeElements method, of class Solution203.
     */
    @Test
    public void testRemoveElements() {
        System.out.println("removeElements");
        Solution203 instance = new Solution203();
        
        assertEquals(null, instance.removeElements(null, 0));
        
        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.removeElements(head2, 2)));
                
        ListNode head3 = ListNode.createInstance(new int[]{1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{2});
        assertTrue(ListNode.isSame(expect3, instance.removeElements(head3, 1)));
        
        ListNode head4 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect4 = ListNode.createInstance(new int[]{1,3});
        assertTrue(ListNode.isSame(expect4, instance.removeElements(head4, 2)));
        
        ListNode head5 = ListNode.createInstance(new int[]{1,5,5,4,5,6});
        ListNode expect5 = ListNode.createInstance(new int[]{1,4,6});
        assertTrue(ListNode.isSame(expect5, instance.removeElements(head5, 5)));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
