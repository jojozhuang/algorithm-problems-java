package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution686Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("repeatedStringMatch");
        Solution686 instance = new Solution686();

        assertEquals(-1, instance.repeatedStringMatch("", "a"));
        assertEquals(3, instance.repeatedStringMatch("abcd", "cdabcdab"));
        assertEquals(-1, instance.repeatedStringMatch("ac", "cc"));
    }
}
