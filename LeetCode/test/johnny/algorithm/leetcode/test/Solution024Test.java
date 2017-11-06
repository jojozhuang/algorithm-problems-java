/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import johnny.algorithm.leetcode.Solution024;
import johnny.algorithm.leetcode.common.ListNode;
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
public class Solution024Test {
    
    public Solution024Test() {
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
     * Test of swapPairs method, of class Solution024.
     */
    @Test
    public void testSwapPairs() {
        System.out.println("swapPairs");
        Solution024 instance = new Solution024();

        assertEquals(null, instance.swapPairs(null));
        
        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.swapPairs(head2)));
        
        ListNode head3 = ListNode.createInstance(new int[]{1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{2,1});
        assertTrue(ListNode.isSame(expect3, instance.swapPairs(head3)));
        
        ListNode head4 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect4 = ListNode.createInstance(new int[]{2,1,3});
        assertTrue(ListNode.isSame(expect4, instance.swapPairs(head4)));
        
        ListNode head5 = ListNode.createInstance(new int[]{1,2,3,4,5,6});
        ListNode expect5 = ListNode.createInstance(new int[]{2,1,4,3,6,5});
        assertTrue(ListNode.isSame(expect5, instance.swapPairs(head5)));
                
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
