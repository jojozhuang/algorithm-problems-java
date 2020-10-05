package johnny.leetcode.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionA1288Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sequentialDigits");
        SolutionA1288 instance = new SolutionA1288();

        assertEquals(1, instance.removeCoveredIntervals(new int[][]{{1,5},{1,4},{1,3},{1,2},{2,3}}));

        assertEquals(2, instance.removeCoveredIntervals(new int[][]{{1,4},{3,6},{2,8}}));
        assertEquals(1, instance.removeCoveredIntervals(new int[][]{{1,4},{2,3}}));
        assertEquals(2, instance.removeCoveredIntervals(new int[][]{{0,10},{5,12}}));
        assertEquals(2, instance.removeCoveredIntervals(new int[][]{{3,10},{4,10},{5,11}}));
        assertEquals(1, instance.removeCoveredIntervals(new int[][]{{1,2},{1,4},{3,4}}));

    }
}
