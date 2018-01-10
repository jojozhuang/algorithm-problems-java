package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution148;
import johnny.algorithm.leetcode.common.ListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution148Test {
    
    public Solution148Test() {
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
     * Test of sortList method, of class Solution148.
     */
    @Test
    public void testSortList() {
        System.out.println("sortList");
        Solution148 instance = new Solution148();

        assertEquals(null, instance.sortList(null));
        
        ListNode head2 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.sortList(head2)));
        
        ListNode head3 = ListNode.createInstance(new int[]{3,1});
        ListNode expect3 = ListNode.createInstance(new int[]{1,3});
        assertTrue(ListNode.isSame(expect3, instance.sortList(head3)));

        ListNode head4 = ListNode.createInstance(new int[]{3,1,2});
        ListNode expect4 = ListNode.createInstance(new int[]{1,2,3});
        assertTrue(ListNode.isSame(expect4, instance.sortList(head4)));
                
        ListNode head5 = ListNode.createInstance(new int[]{3,5,1});
        ListNode expect5 = ListNode.createInstance(new int[]{1,3,5});
        assertTrue(ListNode.isSame(expect5, instance.sortList(head5)));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
