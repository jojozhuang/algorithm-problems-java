package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution984;

public class Solution984Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("strWithout3a3b");
        Solution984 instance = new Solution984();

        assertEquals("aba", instance.strWithout3a3b(2, 1));
        /*
        assertEquals("aab", instance.strWithout3a3b(2, 1));
        assertEquals("abb", instance.strWithout3a3b(1, 2));
        assertEquals("aaba", instance.strWithout3a3b(3, 1));
        assertEquals("bbab", instance.strWithout3a3b(1, 3));
        assertEquals("aabaa", instance.strWithout3a3b(4, 1));
        assertEquals("bbabb", instance.strWithout3a3b(1, 4));
        assertEquals("aabaaba", instance.strWithout3a3b(5, 2));
        assertEquals("bbabbab", instance.strWithout3a3b(2, 5));
        assertEquals("aabaabaa", instance.strWithout3a3b(6, 2));
        assertEquals("aabaabaab", instance.strWithout3a3b(6, 3));
        assertEquals("aabbaabaab", instance.strWithout3a3b(6, 4));
        assertEquals("aabbaabbaab", instance.strWithout3a3b(6, 5));
        assertEquals("aabbaabbaabb", instance.strWithout3a3b(6, 6));
        */
    }
}
