package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution541;

public class Solution541Test extends JunitBase {

    @Test
    public void testReverseStr() {
        System.out.println("reverseStr");
        Solution541 instance = new Solution541();

        assertEquals("", instance.reverseStr("", 2));
        assertEquals("a", instance.reverseStr("a", -1));
        assertEquals("a", instance.reverseStr("a", 2));
        assertEquals("ba", instance.reverseStr("ab", 2));
        assertEquals("abc", instance.reverseStr("abc", 1));
        assertEquals("bacdfe", instance.reverseStr("abcdef", 2));
        assertEquals("bacdfeg", instance.reverseStr("abcdefg", 2));
        assertEquals("cbadef", instance.reverseStr("abcdef", 3));
        assertEquals("fedcba", instance.reverseStr("abcdef", 100));
        assertEquals("cbadefhg", instance.reverseStr("abcdefgh", 3));
    }
}
