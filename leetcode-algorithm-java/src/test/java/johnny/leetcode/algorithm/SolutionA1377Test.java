package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1377Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("frogPosition");
        SolutionA1377 instance = new SolutionA1377();

        assertEquals(0.16666666666666666 , instance.frogPosition(7, new int[][]{{1,2},{1,3},{1,7},{2,4},{2,6},{3,5}}, 2, 4), 0);
        assertEquals(0.3333333333333333 , instance.frogPosition(7, new int[][]{{1,2},{1,3},{1,7},{2,4},{2,6},{3,5}}, 1, 7), 0);
        assertEquals(0.16666666666666666 , instance.frogPosition(7, new int[][]{{1,2},{1,3},{1,7},{2,4},{2,6},{3,5}}, 20, 6), 0);
        assertEquals(1.0 , instance.frogPosition(3, new int[][]{{2,1},{3,2}}, 1, 2), 0);
        assertEquals(0.0 , instance.frogPosition(8, new int[][]{{2,1},{3,2},{4,1},{5,1},{6,4},{7,1},{8,7}}, 7, 7), 0);
    }
}
