package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution516;

public class Solution516Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("longestPalindromeSubseq");
        Solution516 instance = new Solution516();

        assertEquals(4, instance.longestPalindromeSubseq("bbbab"));
        assertEquals(2, instance.longestPalindromeSubseq("cbbd"));
    }
}
