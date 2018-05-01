package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution758;

public class Solution758Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("boldWords");
        Solution758 instance = new Solution758();

        assertEquals("a<b>abc</b>d", instance.boldWords(new String[] {"ab", "bc"}, "aabcd"));
    }
}
