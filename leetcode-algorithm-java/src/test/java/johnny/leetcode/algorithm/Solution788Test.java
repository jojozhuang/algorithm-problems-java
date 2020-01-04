package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution788Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("rotatedDigits");
        Solution788 instance = new Solution788();

        assertEquals(4, instance.rotatedDigits(10));
    }
}
