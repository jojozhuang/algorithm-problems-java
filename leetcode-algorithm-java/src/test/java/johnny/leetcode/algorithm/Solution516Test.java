package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution516Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("longestPalindromeSubseq");
        Solution516 instance = new Solution516();

        assertEquals(4, instance.longestPalindromeSubseq("bbbab"));
        assertEquals(2, instance.longestPalindromeSubseq("cbbd"));
    }
}
