package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA1025;

public class SolutionA1025Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("divisorGame");
        SolutionA1025 instance = new SolutionA1025();

        assertEquals(true, instance.divisorGame(2));
        assertEquals(false, instance.divisorGame(3));
        assertEquals(true, instance.divisorGame(4));
    }
}
