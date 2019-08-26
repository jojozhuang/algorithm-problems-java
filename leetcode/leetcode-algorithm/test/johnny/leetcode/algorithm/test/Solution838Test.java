package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution838;

public class Solution838Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("pushDominoes");
        Solution838 instance = new Solution838();

        assertEquals("L.", instance.pushDominoes("L."));
        assertEquals("RL", instance.pushDominoes("RL"));
        assertEquals("RR.L", instance.pushDominoes("RR.L"));
        assertEquals("LL.RR.LLRRLL..", instance.pushDominoes(".L.R...LR..L.."));
    }
}
