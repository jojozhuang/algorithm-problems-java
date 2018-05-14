package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution488;

public class Solution488Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMinStep");
        Solution488 instance = new Solution488();

        assertEquals(-1, instance.findMinStep("WRRBBW", "RB"));
        assertEquals(2, instance.findMinStep("WWRRBBWW", "WRBRW"));
        assertEquals(2, instance.findMinStep("G", "GGGGG"));
        assertEquals(3, instance.findMinStep("RBYYBBRRB", "YRBGB"));
        assertEquals(2, instance.findMinStep("RRWWRRBBRR", "WB"));
    }
}
