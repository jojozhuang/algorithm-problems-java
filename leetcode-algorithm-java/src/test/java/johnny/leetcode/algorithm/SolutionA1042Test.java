package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionA1042Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("gardenNoAdj");
        SolutionA1042 instance = new SolutionA1042();

        assertArrayEquals(new int[] {1,2,3},instance.gardenNoAdj(3, new int[][] {{1,2},{2,3},{3,1}}));
        assertArrayEquals(new int[] {1,2,1,2},instance.gardenNoAdj(4, new int[][] {{1,2},{3,4}}));
        assertArrayEquals(new int[] {1,2,3,4},instance.gardenNoAdj(4, new int[][] {{1,2},{2,3},{3,4},{4,1},{1,3},{2,4}}));
    }
}
