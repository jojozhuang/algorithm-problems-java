package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution188Test extends JunitBase {

    @Test
    public void testMaxProfit() {
        System.out.println("maxProfit");
        Solution188 instance = new Solution188();

        assertEquals(0, instance.maxProfit(0, null));
        assertEquals(1, instance.maxProfit(1, new int[]{2,1,2,0,1}));
        assertEquals(2, instance.maxProfit(2, new int[]{2,1,2,0,1}));
        assertEquals(2, instance.maxProfit(3, new int[]{2,1,2,0,1}));
        assertEquals(1, instance.maxProfit(1, new int[]{3,2,3,1,2}));
        assertEquals(18, instance.maxProfit(2, new int[]{8,4,5,1,3,7,9,10,3,12}));
        assertEquals(15, instance.maxProfit(2, new int[]{8,4,5,12,3,7,9,10,3,1}));
        assertEquals(0, instance.maxProfit(2, new int[]{8,7,6,5,4,3,2,1}));
        assertEquals(12, instance.maxProfit(2, new int[]{1,3,5,6,7,8,9,13}));
        assertEquals(13, instance.maxProfit(2, new int[]{1,2,4,2,5,7,2,4,9,0}));
    }
}
