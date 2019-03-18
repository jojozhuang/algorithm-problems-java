package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution859;

public class Solution859Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("buddyStrings");
        Solution859 instance = new Solution859();

        assertEquals(false, instance.buddyStrings("",""));
        assertEquals(true, instance.buddyStrings("ab","ba"));
        assertEquals(false, instance.buddyStrings("ab","ab"));
        assertEquals(true, instance.buddyStrings("aa","aa"));
        assertEquals(true, instance.buddyStrings("aaaaaaabc","aaaaaaacb"));
        assertEquals(false, instance.buddyStrings("","aa"));
        assertEquals(true, instance.buddyStrings("abab","abab"));
        assertEquals(true, instance.buddyStrings("acccccb","bccccca"));
    }
}
