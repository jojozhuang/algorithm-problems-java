package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import johnny.algorithm.leetcode.Solution023;
import johnny.algorithm.leetcode.common.ListNode;

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
        Solution023 instance = new Solution023();

        assertEquals(null, instance.mergeKLists(null));
        
        ListNode[] lists2 = ListNode.createList(new int[][]{{1}});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.mergeKLists(lists2)));
        
        ListNode[] lists3 = ListNode.createList(new int[][]{{1,3,8},{2}});
        ListNode expect3 = ListNode.createInstance(new int[]{1,2,3,8});
        assertTrue(ListNode.isSame(expect3, instance.mergeKLists(lists3)));

        ListNode[] lists4 = ListNode.createList(new int[][]{{1,3,8,11},{2},{5,6}});
        ListNode expect4 = ListNode.createInstance(new int[]{1,2,3,5,6,8,11});
        assertTrue(ListNode.isSame(expect4, instance.mergeKLists(lists4)));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mergeKLists2 method, of class Solution023.
     */
    @Test
    public void testMergeKLists2() {
        System.out.println("mergeKLists2");
        Solution023 instance = new Solution023();

        assertEquals(null, instance.mergeKLists(null));
        
        ListNode[] lists2 = ListNode.createList(new int[][]{{1}});
        ListNode expect2 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect2, instance.mergeKLists2(lists2)));
        
        ListNode[] lists3 = ListNode.createList(new int[][]{{1,3,8},{2}});
        ListNode expect3 = ListNode.createInstance(new int[]{1,2,3,8});
        assertTrue(ListNode.isSame(expect3, instance.mergeKLists2(lists3)));

        ListNode[] lists4 = ListNode.createList(new int[][]{{1,3,8,11},{2},{5,6}});
        ListNode expect4 = ListNode.createInstance(new int[]{1,2,3,5,6,8,11});
        assertTrue(ListNode.isSame(expect4, instance.mergeKLists2(lists4)));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
