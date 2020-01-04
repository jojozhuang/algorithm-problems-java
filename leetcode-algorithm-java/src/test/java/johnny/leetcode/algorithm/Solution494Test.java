package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution494Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findTargetSumWays");
        Solution494 instance = new Solution494();

        assertEquals(5, instance.findTargetSumWays(new int[] {1, 1, 1, 1, 1}, 3));
    }
}
