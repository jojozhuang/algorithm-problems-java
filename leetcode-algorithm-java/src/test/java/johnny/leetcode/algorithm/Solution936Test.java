package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution936Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("movesToStamp");
        Solution936 instance = new Solution936();

        assertArrayEquals(new int[] {0,2}, instance.movesToStamp("abc", "ababc"));
        assertArrayEquals(new int[] {0,3,1}, instance.movesToStamp("abca", "aabcaca"));
    }
}
