package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution461;

public class Solution461Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("hammingDistance");
        Solution461 instance = new Solution461();

        assertEquals(2, instance.hammingDistance(1,4));
    }
}
