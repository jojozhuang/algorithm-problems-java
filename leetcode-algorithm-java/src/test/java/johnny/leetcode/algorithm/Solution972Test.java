package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution972Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("kClosest");
        Solution972 instance = new Solution972();

        assertEquals(true, instance.isRationalEqual("0.(52)", "0.5(25)"));
        assertEquals(true, instance.isRationalEqual("0.1666(6)", "0.166(66)"));
    }
}
