package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution936;

public class Solution936Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("movesToStamp");
        Solution936 instance = new Solution936();

        assertArrayEquals(new int[] {0,2}, instance.movesToStamp("abc", "ababc"));
        assertArrayEquals(new int[] {0,3,1}, instance.movesToStamp("abca", "aabcaca"));
    }
}
