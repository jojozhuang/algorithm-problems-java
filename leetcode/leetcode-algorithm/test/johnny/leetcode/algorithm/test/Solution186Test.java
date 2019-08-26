package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution186;

public class Solution186Test extends JunitBase {

    @Test
    public void testReverseWords() {
        System.out.println("reverseWords");
        Solution186 instance = new Solution186();

        char[] s2 = "vc".toCharArray();
        instance.reverseWords(s2);
        assertArrayEquals("vc".toCharArray(), s2);

        char[] s3 = "blue the".toCharArray();
        instance.reverseWords(s3);
        assertArrayEquals("the blue".toCharArray(), s3);

        char[] s4 = "blue is sky the".toCharArray();
        instance.reverseWords(s4);
        assertArrayEquals("the sky is blue".toCharArray(), s4);
    }
}
