package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1017Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("baseNeg2");
        SolutionA1017 instance = new SolutionA1017();

        assertEquals("110", instance.baseNeg2(2));
        assertEquals("111", instance.baseNeg2(3));
        assertEquals("100", instance.baseNeg2(4));
    }
}
