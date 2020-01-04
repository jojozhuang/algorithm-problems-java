package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution471Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("encode");
        Solution471 instance = new Solution471();

        assertEquals("aaa", instance.encode("aaa"));
        assertEquals("5[a]", instance.encode("aaaaa"));
        assertEquals("a9[a]", instance.encode("aaaaaaaaaa"));
        assertEquals("2[aabc]d", instance.encode("aabcaabcd"));
        assertEquals("2[2[abbb]c]", instance.encode("abbbabbbcabbbabbbc"));
    }
}
