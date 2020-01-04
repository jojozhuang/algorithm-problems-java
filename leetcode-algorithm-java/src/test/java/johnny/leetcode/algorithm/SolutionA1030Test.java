package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionA1030Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("allCellsDistOrder");
        SolutionA1030 instance = new SolutionA1030();

        assertArrayEquals(new int[][]{{0,0},{0,1}}, instance.allCellsDistOrder(1,2,0,0));
        assertArrayEquals(new int[][]{{0,1},{1,1},{0,0},{1,0}}, instance.allCellsDistOrder(2,2,0,1));
        assertArrayEquals(new int[][]{{1,2},{1,1},{0,2},{0,1},{1,0},{0,0}}, instance.allCellsDistOrder(2,3,1,2));
    }
}
