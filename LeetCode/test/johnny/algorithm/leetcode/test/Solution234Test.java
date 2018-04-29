package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution234;
import johnny.algorithm.leetcode.common.ListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution234Test {
    
    public Solution234Test() {
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
     * Test of isPalindrome method, of class Solution234.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        Solution234 instance = new Solution234();
        assertEquals(true, instance.isPalindrome(null));
        
        ListNode head2 = ListNode.createInstance(new int[]{1});
        assertEquals(true, instance.isPalindrome(head2));
        
        ListNode head3 = ListNode.createInstance(new int[]{3,1});
        assertEquals(false, instance.isPalindrome(head3));
        
        ListNode head4 = ListNode.createInstance(new int[]{3,1,2});
        assertEquals(false, instance.isPalindrome(head4));
        
        ListNode head5 = ListNode.createInstance(new int[]{4,3,4});
        assertEquals(true, instance.isPalindrome(head5));
        
        ListNode head6 = ListNode.createInstance(new int[]{1,1,2,1});
        assertEquals(false, instance.isPalindrome(head6));
    }
}
