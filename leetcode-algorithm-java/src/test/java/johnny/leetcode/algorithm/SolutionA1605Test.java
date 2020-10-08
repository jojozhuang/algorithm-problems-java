package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1605Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("restoreMatrix");
        SolutionA1605 instance = new SolutionA1605();

        int[][] expect1 = new int[][]{{3,0},
                                      {1,7}};
        assertEquals(expect1, instance.restoreMatrix(new int[]{3,8}, new int[]{4,7}));

        int[][] expect2 = new int[][]{{0,5,0},
                                      {6,1,0},
                                      {2,0,8}};
        assertEquals(expect2, instance.restoreMatrix(new int[]{5,7,10}, new int[]{8,6,8}));

        int[][] expect3 = new int[][] {{0,9,5},
                                       {6,0,3}};
        assertEquals(expect3, instance.restoreMatrix(new int[]{14,9}, new int[]{6,9,8}));

        int[][] expect4 = new int[][] {{1}, {0}};
        assertEquals(expect4, instance.restoreMatrix(new int[]{1,0}, new int[]{1}));

        int[][] expect5 = new int[][] {{0}};
        assertEquals(expect5, instance.restoreMatrix(new int[]{0}, new int[]{0}));
    }
}
