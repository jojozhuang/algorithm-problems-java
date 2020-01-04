package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution479Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestPalindrome");
        Solution479 instance = new Solution479();

        assertEquals(987, instance.largestPalindrome(2));
    }
}
