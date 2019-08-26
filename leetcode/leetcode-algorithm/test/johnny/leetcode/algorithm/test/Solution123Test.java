package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution123;

public class Solution123Test extends JunitBase {

    @Test
    public void testMaxProfit() {
        System.out.println("maxProfit");
        Solution123 instance = new Solution123();

        //assertEquals(0, instance.maxProfit(null));
        assertEquals(2, instance.maxProfit(new int[]{2,1,2,0,1}));
        assertEquals(2, instance.maxProfit(new int[]{3,2,3,1,2}));
        assertEquals(18, instance.maxProfit(new int[]{8,4,5,1,3,7,9,10,3,12}));
        assertEquals(15, instance.maxProfit(new int[]{8,4,5,12,3,7,9,10,3,1}));
        assertEquals(0, instance.maxProfit(new int[]{8,7,6,5,4,3,2,1}));
        assertEquals(12, instance.maxProfit(new int[]{1,3,5,6,7,8,9,13}));
        assertEquals(13, instance.maxProfit(new int[]{1,2,4,2,5,7,2,4,9,0}));
    }
}
