package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution688;

public class Solution688Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("knightProbability");
        Solution688 instance = new Solution688();

        assertEquals(0.0625, instance.knightProbability(3,2,0,0), 0.0);
    }
}
