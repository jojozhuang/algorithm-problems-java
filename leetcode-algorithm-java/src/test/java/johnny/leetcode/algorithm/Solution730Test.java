package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution730;

public class Solution730Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countPalindromicSubsequences");
        Solution730 instance = new Solution730();

        assertEquals(6, instance.countPalindromicSubsequences("bccb"));
        assertEquals(104860361, instance.countPalindromicSubsequences("abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"));
    }
}
