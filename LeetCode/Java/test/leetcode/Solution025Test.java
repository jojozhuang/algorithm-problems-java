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
public class Solution025Test {
    
    public Solution025Test() {
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
     * Test of reverseKGroup method, of class Solution025.
     */
    @Test
    public void testReverseKGroup() {
        System.out.println("reverseKGroup");
        Solution025 instance = new Solution025();

        assertEquals(null, instance.reverseKGroup(null, 0));
        
        ListNode head2 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect2 = ListNode.createInstance(new int[]{2,1,4,3,5});
        assertTrue(ListNode.isSame(expect2, instance.reverseKGroup(head2,2)));
        
        ListNode head3 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect3 = ListNode.createInstance(new int[]{3,2,1,4,5});
        assertTrue(ListNode.isSame(expect3, instance.reverseKGroup(head3,3)));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
