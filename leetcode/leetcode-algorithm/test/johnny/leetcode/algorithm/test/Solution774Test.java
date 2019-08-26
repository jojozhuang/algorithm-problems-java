package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution774;

public class Solution774Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minmaxGasDist");
        Solution774 instance = new Solution774();

        assertEquals(0.500000, instance.minmaxGasDist(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 9),0.001);
    }
}
