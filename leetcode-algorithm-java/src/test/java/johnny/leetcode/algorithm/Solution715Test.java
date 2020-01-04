package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution715Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("RangeModule");
        Solution715 instance = new Solution715();

        instance.addRange(10, 20);
        instance.removeRange(14, 16);
        assertEquals(true, instance.queryRange(10, 14));
        assertEquals(false, instance.queryRange(13, 15));
        assertEquals(true, instance.queryRange(16, 17));
    }
}
