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

import johnny.algorithm.leetcode.Solution061;
import johnny.algorithm.leetcode.common.ListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution061Test {
    
    public Solution061Test() {
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
     * Test of rotateRight method, of class Solution061.
     */
    @Test
    public void testRotateRight() {
        System.out.println("rotateRight");
        Solution061 instance = new Solution061();
        
        assertEquals(null, instance.rotateRight(null, 0));
        
        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.rotateRight(head2,0)));
        
        ListNode head3 = ListNode.createInstance(new int[]{1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{2,1});
        assertTrue(ListNode.isSame(expect3, instance.rotateRight(head3,1)));
        
        ListNode head4 = ListNode.createInstance(new int[]{1,2});
        ListNode expect4 = ListNode.createInstance(new int[]{1,2});
        assertTrue(ListNode.isSame(expect4, instance.rotateRight(head4,2)));
        
        ListNode head5 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect5 = ListNode.createInstance(new int[]{2,3,1});
        assertTrue(ListNode.isSame(expect5, instance.rotateRight(head5,2)));
        
        ListNode head6 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect6 = ListNode.createInstance(new int[]{4,5,1,2,3});
        assertTrue(ListNode.isSame(expect6, instance.rotateRight(head6,2)));
        
        ListNode head7 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect7 = ListNode.createInstance(new int[]{4,5,1,2,3});
        assertTrue(ListNode.isSame(expect7, instance.rotateRight(head7,7)));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
