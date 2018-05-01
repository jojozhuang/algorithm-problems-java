package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution327;

public class Solution327Test extends JunitBase {

    @Test
    public void testCountRangeSum() {
        System.out.println("countRangeSum");
        Solution327 instance = new Solution327();

        assertEquals(0, instance.countRangeSum(null, 0, 0));
        assertEquals(3, instance.countRangeSum(new int[]{-2, 5, -1}, -2, 2));
    }
}
