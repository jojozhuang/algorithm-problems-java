package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution566;

public class Solution566Test extends JunitBase {

    @Test
    public void testMatrixReshape() {
        System.out.println("matrixReshape");
        Solution566 instance = new Solution566();

        int[][] nums1 = new int[][]{};
        int[][] expect1 = new int[][]{};
        assertArrayEquals(expect1, instance.matrixReshape(nums1, 0, 0));

        int[][] nums2 = new int[][]{{1,2}};
        int[][] expect2 = new int[][]{{1},{2}};
        assertArrayEquals(expect2, instance.matrixReshape(nums2, 2, 1));

        int[][] nums3 = new int[][]{{1,2},{3,4}};
        int[][] expect3 = new int[][]{{1,2,3,4}};
        assertArrayEquals(expect3, instance.matrixReshape(nums3, 1, 4));

        int[][] nums4 = new int[][]{{1,2},{3,4}};
        int[][] expect4 = new int[][]{{1,2},{3,4}};
        assertArrayEquals(expect4, instance.matrixReshape(nums4, 2, 4));

        int[][] nums5 = new int[][]{{1,2,3},{4,5,6}};
        int[][] expect5 = new int[][]{{1,2},{3,4},{5,6}};
        assertArrayEquals(expect5, instance.matrixReshape(nums5, 3, 2));
    }
}
