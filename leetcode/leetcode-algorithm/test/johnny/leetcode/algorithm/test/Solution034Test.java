package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution034;

public class Solution034Test extends JunitBase {

    @Test
    public void testSearchRange() {
        System.out.println("searchRange");
        Solution034 instance = new Solution034();

        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(null, 0));
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{}, 0));
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{1}, 0));
        assertArrayEquals(new int[]{0,0}, instance.searchRange(new int[]{1}, 1));
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{1,2}, 3));
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{1,2}, -1));
        assertArrayEquals(new int[]{1,1}, instance.searchRange(new int[]{1,2}, 2));
        assertArrayEquals(new int[]{0,0}, instance.searchRange(new int[]{1,2}, 1));
        assertArrayEquals(new int[]{4,4}, instance.searchRange(new int[]{1,2,3,4,5,6,7,8,9}, 5));
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{1,2,3,4,5,6,7,8,9}, 10));
        assertArrayEquals(new int[]{7,8}, instance.searchRange(new int[]{1,2,3,4,5,6,7,9,9}, 9));
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{1,5}, 4));
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{0,0,1,1,1,4,5,5}, 2));
        assertArrayEquals(new int[]{3,4}, instance.searchRange(new int[]{5,7,7,8,8,10}, 8));
        assertArrayEquals(new int[]{0,5}, instance.searchRange(new int[]{6,6,6,6,6,6}, 6));
    }
}
