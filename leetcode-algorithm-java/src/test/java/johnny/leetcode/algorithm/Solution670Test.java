package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution670Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maximumSwap");
        Solution670 instance = new Solution670();

        assertEquals(7236, instance.maximumSwap(2736));
        assertEquals(9973, instance.maximumSwap(9973));
    }
}
