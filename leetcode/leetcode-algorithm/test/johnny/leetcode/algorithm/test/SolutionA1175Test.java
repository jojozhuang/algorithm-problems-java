package johnny.leetcode.algorithm.test;

import johnny.leetcode.algorithm.SolutionA1175;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1175Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numPrimeArrangements");
        SolutionA1175 instance = new SolutionA1175();

        assertEquals(1, instance.numPrimeArrangements(2));
        assertEquals(2, instance.numPrimeArrangements(3));
        assertEquals(12, instance.numPrimeArrangements(5));
        assertEquals(86400, instance.numPrimeArrangements(11));
        assertEquals(682289015, instance.numPrimeArrangements(100));
    }
}
