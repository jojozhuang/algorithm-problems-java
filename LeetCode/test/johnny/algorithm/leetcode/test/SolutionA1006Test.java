package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA1006;

public class SolutionA1006Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("clumsy");
        SolutionA1006 instance = new SolutionA1006();

        assertEquals(7, instance.clumsy(4));
        assertEquals(12, instance.clumsy(10));

    }
}
