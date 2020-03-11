package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution239Test extends JunitBase {

    @Test
    public void testMaxSlidingWindow() {
        System.out.println("maxSlidingWindow");
        Solution239 instance = new Solution239();

        assertArrayEquals(new int[]{}, instance.maxSlidingWindow(null, 0));
        assertArrayEquals(new int[]{1}, instance.maxSlidingWindow(new int[]{1}, 1));
        assertArrayEquals(new int[]{3,3,5,5,6,7}, instance.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
        assertArrayEquals(new int[]{7,7,8}, instance.maxSlidingWindow(new int[]{1, 2, 7, 7, 8}, 3));
        assertArrayEquals(new int[]{3,3,2,5}, instance.maxSlidingWindow(new int[]{1, 3, 1, 2, 0, 5}, 3));
        assertArrayEquals(new int[]{195}, instance.maxSlidingWindow(new int[]{142,38,100,53,22,84,168,50,194,136,111,13,47,45,151,164,126,47,106,124,183,8,87,38,91,121,102,46,82,195,53,18,11,165,61}, 35));
    }
}
