package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution349Test extends JunitBase {

    @Test
    public void testIntersection() {
        System.out.println("intersection");
        Solution349 instance = new Solution349();

        assertArrayEquals(new int[]{}, instance.intersection(null, null));
        assertArrayEquals(new int[]{2}, instance.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{3}, instance.intersection(new int[]{1, 2, 3}, new int[]{3, 4}));
        assertArrayEquals(new int[]{4,6}, instance.intersection(new int[]{1, 2, 3,4,5,6}, new int[]{4, 6}));
        assertArrayEquals(new int[]{}, instance.intersection(new int[]{1, 2}, new int[]{4, 6}));
        assertArrayEquals(new int[]{1,2}, instance.intersection(new int[]{1, 2}, new int[]{1, 2,3,4,5,6}));
    }
}
