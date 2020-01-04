package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution869Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("reorderedPowerOf2");
        Solution869 instance = new Solution869();

        assertEquals(true, instance.reorderedPowerOf2(1));
        assertEquals(false, instance.reorderedPowerOf2(10));
        assertEquals(true, instance.reorderedPowerOf2(16));
        assertEquals(false, instance.reorderedPowerOf2(24));
        assertEquals(true, instance.reorderedPowerOf2(46));
    }
}
