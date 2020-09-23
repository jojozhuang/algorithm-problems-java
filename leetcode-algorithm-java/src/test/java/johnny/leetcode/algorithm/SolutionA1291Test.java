package johnny.leetcode.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionA1291Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sequentialDigits");
        SolutionA1291 instance = new SolutionA1291();

        assertEquals(Arrays.asList(123,234), instance.sequentialDigits(100,300));
        assertEquals(Arrays.asList(1234,2345,3456,4567,5678,6789,12345), instance.sequentialDigits(1000,13000));
    }
}
