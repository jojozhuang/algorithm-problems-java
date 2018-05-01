package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution122;

public class Solution122Test extends JunitBase {

    @Test
    public void testMaxProfit() {
        System.out.println("maxProfit");
        Solution122 instance = new Solution122();

        assertEquals(0, instance.maxProfit(null));
        assertEquals(2, instance.maxProfit(new int[]{2,1,2,0,1}));
        assertEquals(2, instance.maxProfit(new int[]{3,2,3,1,2}));
        assertEquals(19, instance.maxProfit(new int[]{8,4,5,1,3,7,9,10,3,12}));
        assertEquals(15, instance.maxProfit(new int[]{8,4,5,12,3,7,9,10,3,1}));
        assertEquals(0, instance.maxProfit(new int[]{8,7,6,5,4,3,2,1}));
        assertEquals(12, instance.maxProfit(new int[]{1,3,5,6,7,8,9,13}));
    }
}
