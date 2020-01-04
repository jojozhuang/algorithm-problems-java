package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution357Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countNumbersWithUniqueDigits");
        Solution357 instance = new Solution357();

        assertEquals(91, instance.countNumbersWithUniqueDigits(2));
    }
}
