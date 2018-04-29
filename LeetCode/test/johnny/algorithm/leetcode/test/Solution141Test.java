package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution141;
import johnny.algorithm.leetcode.common.ListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution141Test {
    
    public Solution141Test() {
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
     * Test of hasCycle method, of class Solution141.
     */
    @Test
    public void testHasCycle() {
        System.out.println("hasCycle");
        Solution141 instance = new Solution141();
        
        //Input: 1 -> 2 -> 3
        ListNode head2 = ListNode.createInstance(new int[]{1,2,3});
        assertEquals(false, instance.hasCycle(head2));

        //Input: 1 -> 2 -> 3, 3 -> head 1
        ListNode head3 = ListNode.createInstance(new int[]{1,2,3});
        head3.next.next.next = head3;
        assertEquals(true, instance.hasCycle(head3));
    }
}
