package johnny.algorithm.leetcode.test;

import johnny.algorithm.leetcode.Solution021;
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
public class Solution021Test {
    
    public Solution021Test() {
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
     * Test of mergeTwoLists method, of class Solution021.
     */
    @Test
    public void testMergeTwoLists() {
        System.out.println("mergeTwoLists");
        Solution021 instance = new Solution021();
        assertEquals(null, instance.mergeTwoLists(null, null));
        
        //{1,3,8,11},{2}
        ListNode l21 = ListNode.createInstance(new int[]{1,3,8,11});
        ListNode l22 = new ListNode(2);
        ListNode res2 = ListNode.createInstance(new int[]{1,2,3,8,11});
        assertTrue(ListNode.isSame(res2, instance.mergeTwoLists(l21, l22)));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mergeTwoLists2 method, of class Solution021.
     */
    @Test
    public void testMergeTwoLists2() {
        System.out.println("mergeTwoLists2");
        Solution021 instance = new Solution021();
        assertEquals(null, instance.mergeTwoLists(null, null));
        
        //{1,3,8,11},{2}
        ListNode l21 = ListNode.createInstance(new int[]{1,3,8,11});
        ListNode l22 = new ListNode(2);
        ListNode res2 = ListNode.createInstance(new int[]{1,2,3,8,11});
        assertTrue(ListNode.isSame(res2, instance.mergeTwoLists2(l21, l22)));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
