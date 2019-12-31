package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution743;

public class Solution743Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("networkDelayTime");
        Solution743 instance = new Solution743();

        int[][] times1 = {{1,2,1}};
        assertEquals(-1, instance.networkDelayTime(times1, 2, 2));

        int[][] times2 = {{2,1,1},{2,3,1},{3,4,1}};
        assertEquals(2, instance.networkDelayTime(times2, 4, 2));
    }
}
