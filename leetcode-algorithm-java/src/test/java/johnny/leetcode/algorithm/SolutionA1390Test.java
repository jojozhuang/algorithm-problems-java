package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1390Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sumFourDivisors");
        SolutionA1390 instance = new SolutionA1390();

        assertEquals(32, instance.sumFourDivisors(new int[]{21,4,7}));
    }
}
