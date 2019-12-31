package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.SolutionA1108;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1108Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("defangIPaddr");
        SolutionA1108 instance = new SolutionA1108();

        assertEquals("1[.]1[.]1[.]1",instance.defangIPaddr("1.1.1.1"));
        assertEquals("255[.]100[.]50[.]0",instance.defangIPaddr("255.100.50.0"));
    }
}
