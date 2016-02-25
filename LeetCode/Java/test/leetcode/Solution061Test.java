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
        ListNode head = null;
        int k = 0;
        Solution061 instance = new Solution061();
        ListNode expResult = null;
        ListNode result = instance.rotateRight(head, k);
        assertEquals(expResult, result);
        
        ListNode head2 = new ListNode(1);
        ListNode result2 = instance.rotateRight(head2, 0);
        assertEquals(1, result2.val);
        
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        ListNode result3 = instance.rotateRight(head3, 1);
        assertEquals(2, result3.val);
        assertEquals(1, result3.next.val);
        
        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);
        ListNode result4 = instance.rotateRight(head4, 2);
        assertEquals(1, result4.val);
        assertEquals(2, result4.next.val);
        
        ListNode head5 = new ListNode(1);
        head5.next = new ListNode(2);
        head5.next.next = new ListNode(3);
        ListNode result5 = instance.rotateRight(head5, 2);        
        assertEquals(2, result5.val);
        assertEquals(3, result5.next.val);
        assertEquals(1, result5.next.next.val);

        ListNode head6 = new ListNode(1);
        head6.next = new ListNode(2);
        head6.next.next = new ListNode(3);
        head6.next.next.next = new ListNode(4);
        head6.next.next.next.next = new ListNode(5);
        ListNode result6 = instance.rotateRight(head6, 2);
        assertEquals(4, result6.val);
        assertEquals(5, result6.next.val);
        assertEquals(1, result6.next.next.val);
        assertEquals(2, result6.next.next.next.val);
        assertEquals(3, result6.next.next.next.next.val);
        
        /*ListNode head7 = new ListNode(1);
        head7.next = new ListNode(2);
        head7.next.next = new ListNode(3);
        head7.next.next.next = new ListNode(4);
        head7.next.next.next.next = new ListNode(5);
        ListNode result7 = instance.rotateRight(head7, 7);
        assertEquals(4, result7.val);
        assertEquals(5, result7.next.val);
        assertEquals(1, result7.next.next.val);
        assertEquals(2, result7.next.next.next.val);
        assertEquals(3, result7.next.next.next.next.val);*/
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of rotateRight2 method, of class Solution061.
     */
    @Test
    public void testRotateRight2() {
        System.out.println("rotateRight2");
        ListNode head = null;
        int k = 0;
        Solution061 instance = new Solution061();
        ListNode expResult = null;
        ListNode result = instance.rotateRight2(head, k);
        assertEquals(expResult, result);
        
        ListNode head2 = new ListNode(1);
        ListNode result2 = instance.rotateRight2(head2, 0);
        assertEquals(1, result2.val);
        
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        ListNode result3 = instance.rotateRight2(head3, 1);
        assertEquals(2, result3.val);
        assertEquals(1, result3.next.val);
        
        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);
        ListNode result4 = instance.rotateRight2(head4, 2);
        assertEquals(1, result4.val);
        assertEquals(2, result4.next.val);
        
        ListNode head5 = new ListNode(1);
        head5.next = new ListNode(2);
        head5.next.next = new ListNode(3);
        ListNode result5 = instance.rotateRight2(head5, 2);        
        assertEquals(2, result5.val);
        assertEquals(3, result5.next.val);
        assertEquals(1, result5.next.next.val);

        ListNode head6 = new ListNode(1);
        head6.next = new ListNode(2);
        head6.next.next = new ListNode(3);
        head6.next.next.next = new ListNode(4);
        head6.next.next.next.next = new ListNode(5);
        ListNode result6 = instance.rotateRight2(head6, 2);
        assertEquals(4, result6.val);
        assertEquals(5, result6.next.val);
        assertEquals(1, result6.next.next.val);
        assertEquals(2, result6.next.next.next.val);
        assertEquals(3, result6.next.next.next.next.val);
        
        ListNode head7 = new ListNode(1);
        head7.next = new ListNode(2);
        head7.next.next = new ListNode(3);
        head7.next.next.next = new ListNode(4);
        head7.next.next.next.next = new ListNode(5);
        ListNode result7 = instance.rotateRight2(head7, 7);
        assertEquals(4, result7.val);
        assertEquals(5, result7.next.val);
        assertEquals(1, result7.next.next.val);
        assertEquals(2, result7.next.next.next.val);
        assertEquals(3, result7.next.next.next.next.val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
