package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution350Test extends JunitBase {

    @Test
    public void testIntersect() {
        System.out.println("intersect");
        Solution350 instance = new Solution350();

        assertArrayEquals(new int[]{}, instance.intersect(null, null));
        assertArrayEquals(new int[]{2,2}, instance.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{3}, instance.intersect(new int[]{1, 2, 3}, new int[]{3, 4}));
        assertArrayEquals(new int[]{4,6}, instance.intersect(new int[]{1, 2, 3,4,5,6}, new int[]{4, 6}));
        assertArrayEquals(new int[]{}, instance.intersect(new int[]{1, 2}, new int[]{4, 6}));
        assertArrayEquals(new int[]{1,2}, instance.intersect(new int[]{1, 2}, new int[]{1, 2,3,4,5,6}));
        assertArrayEquals(new int[]{1,1,2}, instance.intersect(new int[]{1, 1,2}, new int[]{1, 1,2,4,5,6}));
    }
}
