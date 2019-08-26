package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution407;

public class Solution407Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("trapRainWater");
        Solution407 instance = new Solution407();

        int[][] heightMap1 = new int[][] {
            {1,4,3,1,3,2},
            {3,2,1,3,2,4},
            {2,3,3,2,3,1}
        };
        assertEquals(4, instance.trapRainWater(heightMap1));
    }
}
