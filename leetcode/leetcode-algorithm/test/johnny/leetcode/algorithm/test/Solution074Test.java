package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution074;

public class Solution074Test extends JunitBase {

    @Test
    public void testSearchMatrix() {
        System.out.println("searchMatrix");
        Solution074 instance = new Solution074();

        assertEquals(false, instance.searchMatrix(null, 0));
        assertEquals(false, instance.searchMatrix(new int[][]{}, 0));
        assertEquals(false, instance.searchMatrix(new int[][]{{}}, 0));
        assertEquals(true, instance.searchMatrix(new int[][]{{1}}, 1));
        assertEquals(true, instance.searchMatrix(new int[][]{{1,2}}, 2));
        assertEquals(false, instance.searchMatrix(new int[][]{{1,2,3}}, 4));
        assertEquals(false, instance.searchMatrix(new int[][]{{1,2,3},{5,6,7}}, 4));
        assertEquals(true, instance.searchMatrix(new int[][]{{1,2,3},{5,6,7}}, 6));
        assertEquals(true, instance.searchMatrix(new int[][]{{1,3,5,7},{10, 11, 16, 20},{23, 30, 34, 50}}, 3));
        assertEquals(true, instance.searchMatrix(new int[][]{{1,3,5,7},{10, 11, 16, 20},{23, 30, 34, 50}}, 30));
        assertEquals(false, instance.searchMatrix(new int[][]{{1,3,5,7},{10, 11, 16, 20},{23, 30, 34, 50}}, 40));
        assertEquals(false, instance.searchMatrix(new int[][]{{1,3,5,7},{10, 11, 16, 20},{23, 30, 34, 50}}, 100));
    }
}
