package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution725;
import johnny.algorithm.leetcode.common.ListNode;

public class Solution725Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("splitListToParts");
        Solution725 instance = new Solution725();

        ListNode root1 = ListNode.createInstance(new int[] {1, 2, 3});
        ListNode[] expect1 = ListNode.createList(new int[][]{{1},{2},{3},{},{}});
        assertArrayEquals(expect1, instance.splitListToParts(root1, 5));

        ListNode root2 = ListNode.createInstance(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        ListNode[] expect2 = ListNode.createList(new int[][]{{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}});
        assertArrayEquals(expect2, instance.splitListToParts(root2, 3));
    }
}
