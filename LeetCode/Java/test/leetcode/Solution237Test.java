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
public class Solution237Test {
    
    public Solution237Test() {
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
     * Test of deleteNode method, of class Solution237.
     */
    @Test
    public void testDeleteNode() {
        System.out.println("deleteNode");
        ListNode node = null;
        Solution237 instance = new Solution237();
        instance.deleteNode(node);
        
        ListNode node2 = new ListNode(1);
        instance.deleteNode(node2);
        //assertEquals(null, node2);

        ListNode node3 = new ListNode(3);
        node3.next = new ListNode(1);
        instance.deleteNode(node3);
        assertEquals(1, node3.val);
        assertEquals(null, node3.next);
        
        ListNode node4 = new ListNode(3);
        node4.next = new ListNode(1);
        node4.next.next = new ListNode(2);
        instance.deleteNode(node4.next);
        assertEquals(3, node4.val);
        assertEquals(2, node4.next.val);
        assertEquals(null, node4.next.next);
        
        ListNode node5 = new ListNode(6);
        node5.next = new ListNode(3);
        node5.next.next = new ListNode(8);
        instance.deleteNode(node5.next.next);
        assertEquals(6, node5.val);
        assertEquals(3, node5.next.val);
        //assertEquals(null, node5.next.next);                
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
