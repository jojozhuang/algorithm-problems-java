package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class IntersectionofTwoLinkedListsTest extends JunitBase {

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
