package johnny.leetcode.algorithm.test;

import johnny.leetcode.algorithm.SolutionA1211;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1211Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("equalSubstring");
        SolutionA1211 instance = new SolutionA1211();
        //assertEquals(3, instance.equalSubstring("abcd", "bcdf", 3));
        //assertEquals(1, instance.equalSubstring("abcd", "cdef", 3));
        //assertEquals(1, instance.equalSubstring("abcd", "acde", 0));
        assertEquals(2, instance.equalSubstring("krrgw", "zjxss", 19));
    }
}
