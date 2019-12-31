package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution479;

public class Solution479Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestPalindrome");
        Solution479 instance = new Solution479();

        assertEquals(987, instance.largestPalindrome(2));
    }
}
