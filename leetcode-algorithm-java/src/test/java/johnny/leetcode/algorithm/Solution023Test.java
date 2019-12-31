package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution023;
import johnny.leetcode.algorithm.common.ListNode;

public class Solution023Test extends JunitBase {

    @Test
    public void testMergeKLists() {
        System.out.println("mergeKLists");
        Solution023 instance = new Solution023();

        assertEquals(null, instance.mergeKLists(null));

        ListNode[] lists1 = ListNode.createList(new int[][]{{1}});
        ListNode expect1 = ListNode.createInstance(new int[]{1});
        assertTrue(ListNode.isSame(expect1, instance.mergeKLists(lists1)));

        ListNode[] lists2 = ListNode.createList(new int[][]{{1,3,8},{2}});
        ListNode expect2 = ListNode.createInstance(new int[]{1,2,3,8});
        assertTrue(ListNode.isSame(expect2, instance.mergeKLists(lists2)));

        ListNode[] lists3 = ListNode.createList(new int[][]{{1,4,5},{1,3,4},{2,6}});
        ListNode expect3 = ListNode.createInstance(new int[]{1,1,2,3,4,4,5,6});
        assertTrue(ListNode.isSame(expect3, instance.mergeKLists(lists3)));

        ListNode[] lists4 = ListNode.createList(new int[][]{{1,3,8,11},{2},{5,6}});
        ListNode expect4 = ListNode.createInstance(new int[]{1,2,3,5,6,8,11});
        assertTrue(ListNode.isSame(expect4, instance.mergeKLists(lists4)));

        ListNode[] lists5 = ListNode.createList(new int[][]{{-10,-9,-9,-3,-1,-1,0},{-5},{4},{-8},{},{-9,-6,-5,-4,-2,2,3},{-3,-3,-2,-1,0}});
        ListNode expect5 = ListNode.createInstance(new int[]{-10,-9,-9,-9,-8,-6,-5,-5,-4,-3,-3,-3,-2,-2,-1,-1,-1,0,0,2,3,4});
        assertTrue(ListNode.isSame(expect5, instance.mergeKLists(lists5)));
    }
}
