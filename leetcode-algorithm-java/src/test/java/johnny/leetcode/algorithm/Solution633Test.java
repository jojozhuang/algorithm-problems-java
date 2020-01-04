package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution633Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("judgeSquareSum");
        Solution633 instance = new Solution633();

        assertEquals(true, instance.judgeSquareSum(5));
        assertEquals(false, instance.judgeSquareSum(3));
    }
}
