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
        /*ListNode result = instance.rotateRight(head, k);
        assertEquals(expResult, result);
        
        ListNode head2 = new ListNode(1);
        ListNode result2 = instance.rotateRight(head2, 0);
        ListNode expResult2 = new ListNode(1);
        assertEquals(expResult2.val, result2.val);
        
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        ListNode result3 = instance.rotateRight(head3, 1);
        ListNode expResult3 = new ListNode(2);
        expResult3.next = new ListNode(1);
        assertEquals(expResult3.val, result3.val);
        assertEquals(expResult3.next.val, result3.next.val);*/
        
        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);
        ListNode result4 = instance.rotateRight(head4, 2);
        ListNode expResult4 = new ListNode(1);
        expResult4.next = new ListNode(2);
        assertEquals(expResult4.val, result4.val);
        assertEquals(expResult4.next.val, result4.next.val);
        
       /* ListNode head5 = new ListNode(1);
        head5.next = new ListNode(2);
        ListNode result5 = instance.rotateRight(head5, 0);
        ListNode expResult5 = new ListNode(1);
        expResult5.next = new ListNode(2);
        assertEquals(expResult5.val, result5.val);
        assertEquals(expResult5.next.val, result5.next.val);

        ListNode head6 = new ListNode(1);
        head6.next = new ListNode(2);
        head6.next.next = new ListNode(3);
        head6.next.next.next = new ListNode(4);
        head6.next.next.next.next = new ListNode(5);
        ListNode result6 = instance.rotateRight(head6, 2);
        ListNode expResult6 = new ListNode(4);
        expResult6.next = new ListNode(5);        
        expResult6.next.next = new ListNode(1);
        expResult6.next.next.next = new ListNode(2);
        expResult6.next.next.next.next = new ListNode(3);
        assertEquals(expResult6.val, result6.val);
        assertEquals(expResult6.next.val, result6.next.val);
        assertEquals(expResult6.next.next.val, result6.next.next.val);
        assertEquals(expResult6.next.next.next.val, result6.next.next.next.val);
        assertEquals(expResult6.next.next.next.next.val, result6.next.next.next.next.val);*/
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
