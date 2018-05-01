package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution459;

public class Solution459Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("repeatedSubstringPattern");
        Solution459 instance = new Solution459();

        assertEquals(true, instance.repeatedSubstringPattern("abab"));
        assertEquals(false, instance.repeatedSubstringPattern("aba"));
        assertEquals(true, instance.repeatedSubstringPattern("abcabcabcabc"));
    }
}
