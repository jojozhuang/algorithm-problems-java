package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution382;
import johnny.leetcode.algorithm.common.ListNode;

public class Solution382Test extends JunitBase {

    @Test
    public void testGetRandom() {
        System.out.println("getRandom");

        ListNode head1 = ListNode.createInstance(new int[]{1,2,3});
        Solution382 instance = new Solution382(head1);
        int result1 = instance.getRandom();
        assertTrue(1 <= result1 && result1 <= 3);
        result1 = instance.getRandom();
        assertTrue(1 <= result1 && result1 <= 3);
        result1 = instance.getRandom();
        assertTrue(1 <= result1 && result1 <= 3);
        result1 = instance.getRandom();
        assertTrue(1 <= result1 && result1 <= 3);

        ListNode head2 = ListNode.createInstance(new int[]{100,101,102});
        Solution382 instance2 = new Solution382(head2);
        int result2 = instance2.getRandom();
        assertTrue(100 <= result2 && result2 <= 102);
        result2 = instance2.getRandom();
        assertTrue(100 <= result2 && result2 <= 102);
        result2 = instance2.getRandom();
        assertTrue(100 <= result2 && result2 <= 102);
        result2 = instance2.getRandom();
        assertTrue(100 <= result2 && result2 <= 102);
    }
}
