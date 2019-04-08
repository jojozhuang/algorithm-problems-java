package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA1028;

public class SolutionA1028Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numPairsDivisibleBy60");
        SolutionA1028 instance = new SolutionA1028();

        assertEquals("110", instance.baseNeg2(2));
        assertEquals("111", instance.baseNeg2(3));
        assertEquals("100", instance.baseNeg2(4));
    }
}
