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
public class Solution369Test {
    
    public Solution369Test() {
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
     * Test of plusOne method, of class Solution369.
     */
    @Test
    public void testPlusOne() {
        System.out.println("plusOne");
        Solution369 instance = new Solution369();

        ListNode expect1 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect1, instance.plusOne(null)));
                
        ListNode head2 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect2 = ListNode.createInstance(new int[]{1,2,4});
        assertTrue(ListNode.isSame(expect2, instance.plusOne(head2)));
        
        ListNode head3 = ListNode.createInstance(new int[]{9,9,9});
        ListNode expect3 = ListNode.createInstance(new int[]{1,0,0,0});
        assertTrue(ListNode.isSame(expect3, instance.plusOne(head3)));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
