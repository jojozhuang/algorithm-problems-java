package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
