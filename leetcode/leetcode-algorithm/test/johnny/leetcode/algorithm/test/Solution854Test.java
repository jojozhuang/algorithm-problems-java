package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution854;

public class Solution854Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("kSimilarity");
        Solution854 instance = new Solution854();

        assertEquals(1, instance.kSimilarity("ab", "ba"));
        assertEquals(2, instance.kSimilarity("abc", "bca"));
        assertEquals(2, instance.kSimilarity("abac", "baca"));
        assertEquals(2, instance.kSimilarity("aabc", "abca"));
    }
}
