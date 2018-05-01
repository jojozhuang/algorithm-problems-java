package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution664;

public class Solution664Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("strangePrinter");
        Solution664 instance = new Solution664();

        assertEquals(2, instance.strangePrinter("aaabbb"));
        assertEquals(2, instance.strangePrinter("aba"));
    }
}
