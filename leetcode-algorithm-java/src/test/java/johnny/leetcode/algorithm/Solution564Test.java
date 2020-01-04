package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution564Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("nearestPalindromic");
        Solution564 instance = new Solution564();

        assertEquals("121", instance.nearestPalindromic("123"));
    }
}
