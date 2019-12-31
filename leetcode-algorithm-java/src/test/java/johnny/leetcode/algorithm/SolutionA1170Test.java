package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.SolutionA1170;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionA1170Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSmallerByFrequency");
        SolutionA1170 instance = new SolutionA1170();

        assertArrayEquals(new int[]{1}, instance.numSmallerByFrequency(new String[]{"cbd"}, new String[]{"zaaaz"}));
        assertArrayEquals(new int[]{1,2}, instance.numSmallerByFrequency(new String[]{"bbb","cc"}, new String[]{"a","aa","aaa","aaaa"}));
    }
}
