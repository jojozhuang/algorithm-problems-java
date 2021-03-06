package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution210Test extends JunitBase {

    @Test
    public void testFindOrder() {
        System.out.println("findOrder");
        Solution210 instance = new Solution210();

        assertArrayEquals(new int[0], instance.findOrder(0, null));
        assertArrayEquals(new int[]{0,1}, instance.findOrder(2, new int[][]{}));
        assertArrayEquals(new int[]{0,1}, instance.findOrder(2, new int[][]{{1,0}}));
        assertArrayEquals(new int[]{}, instance.findOrder(2, new int[][]{{1,0},{0,1}}));

        int[] result5 = instance.findOrder(4, new int[][]{{1,0},{2,0},{3,1},{3,2}});
        assertArrayEquals(new int[]{0,1,2,3}, result5);
    }
}
