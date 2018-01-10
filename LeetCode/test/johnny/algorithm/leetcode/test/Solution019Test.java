package johnny.algorithm.leetcode.test;

import johnny.algorithm.leetcode.Solution019;
import johnny.algorithm.leetcode.common.ListNode;
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
public class Solution019Test {
    
    public Solution019Test() {
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
     * Test of removeNthFromEnd2 method, of class Solution019.
     */
    @Test
    public void testRemoveNthFromEnd2() {
        System.out.println("removeNthFromEnd2");        
        Solution019 instance = new Solution019();
       
        // 1 , 1
        ListNode result1 = instance.removeNthFromEnd(new ListNode(1), 1);
        assertEquals(null, result1);
        
        //Input:	{1,2}, 1
        ListNode head2 = ListNode.createInstance(new int[]{1,2});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.removeNthFromEnd(head2,1)));
        
        //Input:	{1,2,3}, 2
        ListNode head3 = ListNode.createInstance(new int[]{1,2,3});
        ListNode expect3 = ListNode.createInstance(new int[]{1,3});
        assertTrue(ListNode.isSame(expect3, instance.removeNthFromEnd(head3,2)));
        
        //1->2->3->4->5, 2
        ListNode head4 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect4 = ListNode.createInstance(new int[]{1,2,3,5});
        assertTrue(ListNode.isSame(expect4, instance.removeNthFromEnd(head4,2)));
        
        //1->2->3->4->5, 1
        ListNode head5 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect5 = ListNode.createInstance(new int[]{1,2,3,4});
        assertTrue(ListNode.isSame(expect5, instance.removeNthFromEnd(head5,1)));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
