package johnny.leetcode.algorithm;

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
