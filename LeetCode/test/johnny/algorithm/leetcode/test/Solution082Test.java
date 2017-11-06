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

import johnny.algorithm.leetcode.Solution082;
import johnny.algorithm.leetcode.common.ListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution082Test {
    
    public Solution082Test() {
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
     * Test of deleteDuplicates method, of class Solution082.
     */
    @Test
    public void testDeleteDuplicates() {
        System.out.println("deleteDuplicates");
        Solution082 instance = new Solution082();

        assertEquals(null, instance.deleteDuplicates(null));
        
        ListNode head2 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect2 = ListNode.createInstance(new int[]{1,2,3});
        assertTrue(ListNode.isSame(expect2, instance.deleteDuplicates(head2)));
        
        ListNode head3 = ListNode.createInstance(new int[]{1,1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{2});
        assertTrue(ListNode.isSame(expect3, instance.deleteDuplicates(head3)));
        
        ListNode head4 = ListNode.createInstance(new int[]{1,1,1,2,3});
        ListNode expect4 = ListNode.createInstance(new int[]{2,3});
        assertTrue(ListNode.isSame(expect4, instance.deleteDuplicates(head4)));
        
        ListNode head5 = ListNode.createInstance(new int[]{1,2,3,3,4,4,5});
        ListNode expect5 = ListNode.createInstance(new int[]{1,2,5});
        assertTrue(ListNode.isSame(expect5, instance.deleteDuplicates(head5)));
                
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
