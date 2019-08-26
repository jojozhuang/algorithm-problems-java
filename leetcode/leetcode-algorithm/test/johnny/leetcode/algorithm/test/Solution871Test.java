package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution871;

public class Solution871Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minRefuelStops");
        Solution871 instance = new Solution871();

        assertEquals(0, instance.minRefuelStops(1,1,new int[][] {}));
        assertEquals(-1, instance.minRefuelStops(100,1,new int[][] {{10,100}}));
        int[][] stations3 = new int[][]{{10,60},{20,30},{30,30},{60,40}};
        assertEquals(2, instance.minRefuelStops(100,10,stations3));
    }
}
