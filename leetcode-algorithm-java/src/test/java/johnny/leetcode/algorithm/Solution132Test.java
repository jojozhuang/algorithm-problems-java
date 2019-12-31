package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution132;

public class Solution132Test extends JunitBase {

    @Test
    public void testMinCut() {
        System.out.println("minCut");
        Solution132 instance = new Solution132();

        assertEquals(0, instance.minCut(""));
        assertEquals(0,  instance.minCut("a"));
        assertEquals(1,  instance.minCut("ab"));
        assertEquals(0,  instance.minCut("aba"));
        assertEquals(2,  instance.minCut("abc"));
        assertEquals(1,  instance.minCut("aab"));
    }
}
