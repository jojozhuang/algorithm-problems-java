package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.IntersectionofTwoLinkedLists;
import johnny.lintcode.algorithm.common.ListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class IntersectionofTwoLinkedListsTest {
    
    public IntersectionofTwoLinkedListsTest() {
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
     * Test of getIntersectionNode method, of class IntersectionofTwoLinkedLists.
     */
    @Test
    public void testGetIntersectionNode() {
        System.out.println("getIntersectionNode");
        ListNode headA = null;
        ListNode headB = null;
        IntersectionofTwoLinkedLists instance = new IntersectionofTwoLinkedLists();
        ListNode expResult = null;
        ListNode result = instance.getIntersectionNode(headA, headB);
        assertEquals(expResult, result);
        
        ListNode headA2 = new ListNode(1);
        ListNode curr2 = headA2;
        for (int i = 2; i <= 13; i++) {
            curr2.next = new ListNode(i);
            curr2 = curr2.next;
        }
        ListNode headB2 = new ListNode(1);
        curr2 = headB2;
        for (int i = 2; i <= 13; i++) {
            curr2.next = new ListNode(i);
            curr2 = curr2.next;
        }
        ListNode result2 = instance.getIntersectionNode(headA2, headB2);
        assertEquals(headA2, result2);
    }
}
