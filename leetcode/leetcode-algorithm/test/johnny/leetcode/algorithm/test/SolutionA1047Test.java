package johnny.leetcode.algorithm.test;

import johnny.leetcode.algorithm.SolutionA1047;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1047Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("removeDuplicates");
        SolutionA1047 instance = new SolutionA1047();

        assertEquals("ca", instance.removeDuplicates("abbaca"));
    }
}
