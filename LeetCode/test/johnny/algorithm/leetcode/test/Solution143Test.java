package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution143;
import johnny.algorithm.leetcode.common.ListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution143Test {
    
    public Solution143Test() {
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
     * Test of reorderList method, of class Solution143.
     */
    @Test
    public void testReorderList() {
        System.out.println("reorderList");
        ListNode head = null;
        Solution143 instance = new Solution143();
        instance.reorderList(head);
        assertEquals(null, head);
        
        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        instance.reorderList(head2);
        assertTrue(ListNode.isSame(expect2, head2));
                
        ListNode head3 = ListNode.createInstance(new int[]{1,2});
        ListNode expect3 = ListNode.createInstance(new int[]{1,2});
        instance.reorderList(head3);
        assertTrue(ListNode.isSame(expect3, head3));
        
        ListNode head4 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect4 = ListNode.createInstance(new int[]{1,3,2});
        instance.reorderList(head4);
        assertTrue(ListNode.isSame(expect4, head4));
        
        ListNode head5 = ListNode.createInstance(new int[]{1,2,3,4});
        ListNode expect5 = ListNode.createInstance(new int[]{1,4,2,3});
        instance.reorderList(head5);
        assertTrue(ListNode.isSame(expect5, head5));
        
        ListNode head6 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect6 = ListNode.createInstance(new int[]{1,5,2,4,3});
        instance.reorderList(head6);
        assertTrue(ListNode.isSame(expect6, head6));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
