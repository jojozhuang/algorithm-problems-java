/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.RandomListNode;
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
public class Solution138Test {
    
    public Solution138Test() {
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
     * Test of copyRandomList method, of class Solution138.
     */
    @Test
    public void testCopyRandomList() {
        System.out.println("copyRandomList");
        RandomListNode head = null;
        Solution138 instance = new Solution138();
        RandomListNode expResult = null;
        RandomListNode result = instance.copyRandomList(head);
        assertEquals(expResult, result);
        
        RandomListNode head2 = new RandomListNode(1);
        head2.next = new RandomListNode(2);
        head2.next.next = new RandomListNode(3);
        head2.next.next.next = new RandomListNode(4);        
        head2.random = head2.next.next;
        head2.next.next.next.random = head2.next;
        RandomListNode result2 = instance.copyRandomList(head2);
        assertEquals(1, result2.label);
        assertEquals(2, result2.next.label);
        assertEquals(3, result2.next.next.label);
        assertEquals(4, result2.next.next.next.label);
        assertEquals(3, result2.random.label);
        assertEquals(2, result2.next.next.next.random.label);
        assertEquals(null, result2.next.random);
        assertEquals(null, result2.next.next.random);
        
        RandomListNode head3 = new RandomListNode(6);
        RandomListNode result3 = instance.copyRandomList(head3);
        assertEquals(6, result3.label);
        assertEquals(null, result3.next);
        
        RandomListNode head4 = new RandomListNode(7);
        head4.next = new RandomListNode(8);
        head4.random = head4.next;
        RandomListNode result4 = instance.copyRandomList(head4);
        assertEquals(7, result4.label);
        assertEquals(8, result4.next.label);
        assertEquals(8, result4.random.label);
        
        RandomListNode head5 = new RandomListNode(-7);
        head5.next = new RandomListNode(8);
        head5.random = head5.next;
        RandomListNode result5 = instance.copyRandomList(head5);
        assertEquals(-7, result5.label);
        assertEquals(8, result5.next.label);
        assertEquals(8, result5.random.label);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
