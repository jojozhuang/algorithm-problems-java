package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution461;

public class Solution461Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("hammingDistance");
        Solution461 instance = new Solution461();

        assertEquals(2, instance.hammingDistance(1,4));
    }
}
