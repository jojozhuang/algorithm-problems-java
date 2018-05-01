package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution727;

public class Solution727Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minWindow");
        Solution727 instance = new Solution727();

        assertEquals("bcde", instance.minWindow("abcdebdde", "bde"));
    }
}
