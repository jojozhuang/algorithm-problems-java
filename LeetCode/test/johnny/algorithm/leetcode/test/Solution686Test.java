package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution686;

public class Solution686Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("repeatedStringMatch");
        Solution686 instance = new Solution686();

        assertEquals(3, instance.repeatedStringMatch("abcd", "cdabcdab"));
    }
}
