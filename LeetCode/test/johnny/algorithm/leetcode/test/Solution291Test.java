package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution291;

public class Solution291Test extends JunitBase {

    @Test
    public void testWordPatternMatch() {
        System.out.println("wordPatternMatch");
        Solution291 instance = new Solution291();

        assertEquals(true, instance.wordPatternMatch("", ""));
        assertEquals(true, instance.wordPatternMatch("abab", "redblueredblue"));
        assertEquals(true, instance.wordPatternMatch("aaaa", "asdasdasdasd"));
        assertEquals(false, instance.wordPatternMatch("aabb", "xyzabcxzyabc"));
    }
}
