package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution147;
import johnny.algorithm.leetcode.common.ListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution147Test {
    
    public Solution147Test() {
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
     * Test of insertionSortList method, of class Solution147.
     */
    @Test
    public void testInsertionSortList() {
        System.out.println("insertionSortList");
        Solution147 instance = new Solution147();

        assertEquals(null, instance.insertionSortList(null));
        
        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.insertionSortList(head2)));
        
        ListNode head3 = ListNode.createInstance(new int[]{3,1});
        ListNode expect3 = ListNode.createInstance(new int[]{1,3});
        assertTrue(ListNode.isSame(expect3, instance.insertionSortList(head3)));

        ListNode head4 = ListNode.createInstance(new int[]{3,1,2});
        ListNode expect4 = ListNode.createInstance(new int[]{1,2,3});
        assertTrue(ListNode.isSame(expect4, instance.insertionSortList(head4)));
                
        ListNode head5 = ListNode.createInstance(new int[]{3,5,1});
        ListNode expect5 = ListNode.createInstance(new int[]{1,3,5});
        assertTrue(ListNode.isSame(expect5, instance.insertionSortList(head5)));
                
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
