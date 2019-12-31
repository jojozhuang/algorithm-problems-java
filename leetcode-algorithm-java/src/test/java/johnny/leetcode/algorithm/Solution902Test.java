package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution902;

public class Solution902Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("atMostNGivenDigitSet");
        Solution902 instance = new Solution902();

        assertEquals(20, instance.atMostNGivenDigitSet(new String[] {"1","3","5","7"}, 100));
        assertEquals(29523, instance.atMostNGivenDigitSet(new String[] {"1","4","9"}, 1000000000));
    }
}
