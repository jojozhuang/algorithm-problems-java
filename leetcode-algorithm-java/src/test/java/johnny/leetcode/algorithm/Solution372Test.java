package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution372Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("superPow");
        Solution372 instance = new Solution372();

        assertEquals(8, instance.superPow(2, new int[] {3}));
        assertEquals(1024, instance.superPow(2, new int[] {1,0}));
    }
}
