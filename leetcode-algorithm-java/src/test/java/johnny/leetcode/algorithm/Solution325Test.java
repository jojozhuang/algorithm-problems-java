package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution325Test extends JunitBase {

    @Test
    public void testMaxSubArrayLen() {
        System.out.println("maxSubArrayLen");
        Solution325 instance = new Solution325();

        assertEquals(0, instance.maxSubArrayLen(null, 0));
        assertEquals(4, instance.maxSubArrayLen(new int[]{1, -1, 5, -2, 3}, 3));
        assertEquals(2, instance.maxSubArrayLen(new int[]{-2, -1, 2, 1}, 1));
    }
}
