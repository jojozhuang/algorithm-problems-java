package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution121Test extends JunitBase {

    @Test
    public void testMaxProfit() {
        System.out.println("maxProfit");
        Solution121 instance = new Solution121();

        assertEquals(0, instance.maxProfit(null));
        assertEquals(1, instance.maxProfit(new int[]{3,2,3,1,2}));
        assertEquals(11, instance.maxProfit(new int[]{8,4,5,1,3,7,9,10,3,12}));
        assertEquals(8, instance.maxProfit(new int[]{8,4,5,12,3,7,9,10,3,1}));
        assertEquals(0, instance.maxProfit(new int[]{8,7,6,5,4,3,2,1}));
        assertEquals(12, instance.maxProfit(new int[]{1,3,5,6,7,8,9,13}));
    }
}
