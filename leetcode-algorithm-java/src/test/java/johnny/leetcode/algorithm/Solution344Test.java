package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution344;

public class Solution344Test extends JunitBase {

    @Test
    public void testReverseString() {
        System.out.println("reverseString");
        Solution344 instance = new Solution344();

        assertEquals("", instance.reverseString(""));
        assertEquals("a", instance.reverseString("a"));
        assertEquals("ba", instance.reverseString("ab"));
        assertEquals("olleh", instance.reverseString("hello"));
    }
}
