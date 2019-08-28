package johnny.leetcode.algorithm.test;

import johnny.leetcode.algorithm.SolutionA1137;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1137Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("tribonacci");
        SolutionA1137 instance = new SolutionA1137();

        assertEquals(4, instance.tribonacci(4));
        assertEquals(1389537, instance.tribonacci(25));
    }
}
