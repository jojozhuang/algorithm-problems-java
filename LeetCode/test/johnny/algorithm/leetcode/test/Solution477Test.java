package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution477;

public class Solution477Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("totalHammingDistance");
        Solution477 instance = new Solution477();

        assertEquals(6, instance.totalHammingDistance(new int[] {4, 14, 2}));
    }
}
