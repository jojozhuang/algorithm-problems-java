package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution234Test extends JunitBase {

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
