package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution738;

public class Solution738Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("monotoneIncreasingDigits");
        Solution738 instance = new Solution738();

        assertEquals(9, instance.monotoneIncreasingDigits(10));
        assertEquals(1234, instance.monotoneIncreasingDigits(1234));
        assertEquals(299, instance.monotoneIncreasingDigits(332));
    }
}
