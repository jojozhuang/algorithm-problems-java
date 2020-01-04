package johnny.leetcode.algorithm;

import johnny.algorithm.common.RandomListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution138Test extends JunitBase {

    @Test
    public void testCopyRandomList() {
        System.out.println("copyRandomList");
        Solution138 instance = new Solution138();

        assertEquals(null, instance.copyRandomList(null));

        RandomListNode head2 = RandomListNode.createInstance(new int[]{6},new int[]{-1});
        RandomListNode expect2 = RandomListNode.createInstance(new int[]{6},new int[]{-1});
        assertTrue(RandomListNode.isSame(expect2, instance.copyRandomList(head2)));

        RandomListNode head3 = RandomListNode.createInstance(new int[]{7,8},new int[]{1,-1});
        RandomListNode expect3 = RandomListNode.createInstance(new int[]{7,8},new int[]{1,-1});
        assertTrue(RandomListNode.isSame(expect3, instance.copyRandomList(head3)));

        RandomListNode head4 = RandomListNode.createInstance(new int[]{-7,8},new int[]{1,-1});
        RandomListNode expect4 = RandomListNode.createInstance(new int[]{-7,8},new int[]{1,-1});
        assertTrue(RandomListNode.isSame(expect4, instance.copyRandomList(head4)));

        RandomListNode head5 = RandomListNode.createInstance(new int[]{-1},new int[]{-1});
        RandomListNode expect5 = RandomListNode.createInstance(new int[]{-1},new int[]{-1});
        assertTrue(RandomListNode.isSame(expect5, instance.copyRandomList(head5)));

        RandomListNode head6 = RandomListNode.createInstance(new int[]{1,2,3,4},new int[]{2,-1,-1,1});
        RandomListNode expect6 = RandomListNode.createInstance(new int[]{1,2,3,4},new int[]{2,-1,-1,1});
        assertTrue(RandomListNode.isSame(expect6, instance.copyRandomList(head6)));
    }
}
