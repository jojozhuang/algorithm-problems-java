package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution035;

public class Solution035Test extends JunitBase {

    @Test
    public void testSearchInsert() {
        System.out.println("searchInsert");
        Solution035 instance = new Solution035();

        assertEquals(0, instance.searchInsert(null, 0));
        assertEquals(0, instance.searchInsert(new int[]{}, 0));
        assertEquals(0, instance.searchInsert(new int[]{1}, 0));
        assertEquals(0, instance.searchInsert(new int[]{1}, 1));
        assertEquals(2, instance.searchInsert(new int[]{1,2}, 3));
        assertEquals(0, instance.searchInsert(new int[]{1,2}, -1));
        assertEquals(1, instance.searchInsert(new int[]{1,2}, 2));
        assertEquals(0, instance.searchInsert(new int[]{1,2}, 1));
        assertEquals(4, instance.searchInsert(new int[]{1,2,3,4,5,6,7,8,9}, 5));
        assertEquals(9, instance.searchInsert(new int[]{1,2,3,4,5,6,7,8,9}, 10));
        assertEquals(8, instance.searchInsert(new int[]{1,2,3,4,5,6,7,8,9}, 9));
        assertEquals(1, instance.searchInsert(new int[]{1,5}, 4));
        assertEquals(2, instance.searchInsert(new int[]{0,1,4,5}, 2));
        assertEquals(2, instance.searchInsert(new int[]{1,3,5,6}, 5));
        assertEquals(1, instance.searchInsert(new int[]{1,3,5,6}, 2));
        assertEquals(4, instance.searchInsert(new int[]{1,3,5,6}, 7));
    }
}
