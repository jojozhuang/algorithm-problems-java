package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution866;

public class Solution866Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("primePalindrome");
        Solution866 instance = new Solution866();

        assertEquals(7, instance.primePalindrome(6));
        assertEquals(11, instance.primePalindrome(8));
        assertEquals(101, instance.primePalindrome(13));
    }
}
