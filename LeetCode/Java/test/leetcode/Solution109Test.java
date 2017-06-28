/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;
import leetcode.common.TreeNode;
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
public class Solution109Test {
    
    public Solution109Test() {
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
     * Test of sortedListToBST method, of class Solution109.
     */
    @Test
    public void testSortedListToBST() {
        System.out.println("sortedListToBST");
        ListNode head = null;
        Solution109 instance = new Solution109();
        TreeNode expResult = null;
        TreeNode result = instance.sortedListToBST(head);
        assertEquals(expResult, result);
        
        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(2);
        TreeNode result2 = instance.sortedListToBST(node2);
        TreeNode expResult2 = TreeNode.createInstance(new String[] {"2","1","#"});
        assertEquals(expResult2.val, result2.val);
        assertEquals(expResult2.left.val, result2.left.val);
        
        ListNode node3 = new ListNode(1);
        node3.next = new ListNode(2);
        node3.next.next = new ListNode(3);
        TreeNode result3 = instance.sortedListToBST(node3);
        TreeNode expResult3 = TreeNode.createInstance(new String[] {"2","1","3"});
        assertEquals(expResult3.val, result3.val);
        assertEquals(expResult3.left.val, result3.left.val);
        assertEquals(expResult3.right.val, result3.right.val);
        
        ListNode node4 = new ListNode(1);
        node4.next = new ListNode(2);
        node4.next.next = new ListNode(3);
        node4.next.next.next = new ListNode(4);
        node4.next.next.next.next = new ListNode(5);
        node4.next.next.next.next.next = new ListNode(6);
        node4.next.next.next.next.next.next = new ListNode(7);
        node4.next.next.next.next.next.next.next = new ListNode(8);
        node4.next.next.next.next.next.next.next.next = new ListNode(9);
        TreeNode result4 = instance.sortedListToBST(node4);
        TreeNode expResult4 = TreeNode.createInstance(new String[] {"5","3","8","2","4","7","9","1","#","#","#","6","#"});
        assertEquals(expResult4.val, result4.val);
        assertEquals(expResult4.left.val, result4.left.val);
        assertEquals(expResult4.left.left.val, result4.left.left.val);
        assertEquals(expResult4.left.right.val, result4.left.right.val);
        assertEquals(expResult4.left.left.left.val, result4.left.left.left.val);
        assertEquals(expResult4.right.val, result4.right.val);
        assertEquals(expResult4.right.left.val, result4.right.left.val);
        assertEquals(expResult4.right.left.left.val, result4.right.left.left.val);
        assertEquals(expResult4.right.right.val, result4.right.right.val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
