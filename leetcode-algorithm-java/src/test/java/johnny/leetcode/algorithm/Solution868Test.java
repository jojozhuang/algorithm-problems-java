package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution868Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("binaryGap");
        Solution868 instance = new Solution868();

        assertEquals(2, instance.binaryGap(22));
        assertEquals(2, instance.binaryGap(5));
        assertEquals(1, instance.binaryGap(6));
        assertEquals(0, instance.binaryGap(8));
    }
}
