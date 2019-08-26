package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.SolutionA1165;

public class SolutionA1165Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("calculateTime");
        SolutionA1165 instance = new SolutionA1165();

        assertEquals(4, instance.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"));
        assertEquals(73, instance.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"));
    }
}
