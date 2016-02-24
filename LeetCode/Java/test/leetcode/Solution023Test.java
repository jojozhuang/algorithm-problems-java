/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
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
public class Solution023Test {
    
    public Solution023Test() {
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
     * Test of mergeKLists method, of class Solution023.
     */
    @Test
    public void testMergeKLists() {
        System.out.println("mergeKLists");
        ListNode[] lists = null;
        Solution023 instance = new Solution023();
        ListNode expResult = null;
        ListNode result = instance.mergeKLists(lists);
        assertEquals(expResult, result);
        
        ListNode node21 = new ListNode(1);
        ListNode[] lists2 = new ListNode[1];
        lists2[0] = node21;
        ListNode result2 = instance.mergeKLists(lists2);
        assertEquals(1, result2.val);
        assertEquals(null, result2.next);
        
        ListNode node31 = new ListNode(1);
        node31.next = new ListNode(3);
        node31.next.next = new ListNode(8);
        ListNode node32 = new ListNode(2);
        ListNode[] lists3 = new ListNode[2];
        lists3[0] = node31;
        lists3[1] = node32;
        ListNode result3 = instance.mergeKLists(lists3);
        assertEquals(1, result3.val);
        assertEquals(2, result3.next.val);
        assertEquals(3, result3.next.next.val);
        assertEquals(8, result3.next.next.next.val);
        assertEquals(null, result3.next.next.next.next);
        
        ListNode node41 = new ListNode(1);
        node41.next = new ListNode(3);
        node41.next.next = new ListNode(8);
        node41.next.next.next = new ListNode(11);
        ListNode node42 = new ListNode(2);
        ListNode node43 = new ListNode(5);
        node43.next = new ListNode(6);            
        ListNode[] lists4 = new ListNode[3];
        lists4[0] = node41;
        lists4[1] = node42;
        lists4[2] = node43;
        ListNode result4 = instance.mergeKLists(lists4);
        assertEquals(1, result4.val);
        assertEquals(2, result4.next.val);
        assertEquals(3, result4.next.next.val);
        assertEquals(5, result4.next.next.next.val);
        assertEquals(6, result4.next.next.next.next.val);
        assertEquals(8, result4.next.next.next.next.next.val);
        assertEquals(11, result4.next.next.next.next.next.next.val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mergeKLists2 method, of class Solution023.
     */
    @Test
    public void testMergeKLists2() {
        System.out.println("mergeKLists2");
        ListNode[] lists = null;
        Solution023 instance = new Solution023();
        ListNode expResult = null;
        ListNode result = instance.mergeKLists2(lists);
        assertEquals(expResult, result);
        
        ListNode node21 = new ListNode(1);
        ListNode[] lists2 = new ListNode[1];
        lists2[0] = node21;
        ListNode result2 = instance.mergeKLists2(lists2);
        assertEquals(1, result2.val);
        assertEquals(null, result2.next);
        
        ListNode node31 = new ListNode(1);
        node31.next = new ListNode(3);
        node31.next.next = new ListNode(8);
        ListNode node32 = new ListNode(2);
        ListNode[] lists3 = new ListNode[2];
        lists3[0] = node31;
        lists3[1] = node32;
        ListNode result3 = instance.mergeKLists2(lists3);
        assertEquals(1, result3.val);
        assertEquals(2, result3.next.val);
        assertEquals(3, result3.next.next.val);
        assertEquals(8, result3.next.next.next.val);
        assertEquals(null, result3.next.next.next.next);
        
        ListNode node41 = new ListNode(1);
        node41.next = new ListNode(3);
        node41.next.next = new ListNode(8);
        node41.next.next.next = new ListNode(11);
        ListNode node42 = new ListNode(2);
        ListNode node43 = new ListNode(5);
        node43.next = new ListNode(6);            
        ListNode[] lists4 = new ListNode[3];
        lists4[0] = node41;
        lists4[1] = node42;
        lists4[2] = node43;
        ListNode result4 = instance.mergeKLists2(lists4);
        assertEquals(1, result4.val);
        assertEquals(2, result4.next.val);
        assertEquals(3, result4.next.next.val);
        assertEquals(5, result4.next.next.next.val);
        assertEquals(6, result4.next.next.next.next.val);
        assertEquals(8, result4.next.next.next.next.next.val);
        assertEquals(11, result4.next.next.next.next.next.next.val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
