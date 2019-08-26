package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution441;

public class Solution441Test extends JunitBase {

    @Test
    public void testArrangeCoins() {
        System.out.println("arrangeCoins");
        Solution441 instance = new Solution441();

        assertEquals(0, instance.arrangeCoins(0));
        assertEquals(1, instance.arrangeCoins(1));
        assertEquals(1, instance.arrangeCoins(2));
        assertEquals(2, instance.arrangeCoins(3));
        assertEquals(2, instance.arrangeCoins(4));
        assertEquals(2, instance.arrangeCoins(5));
        assertEquals(3, instance.arrangeCoins(6));
        assertEquals(3, instance.arrangeCoins(7));
        assertEquals(3, instance.arrangeCoins(8));
        assertEquals(60070, instance.arrangeCoins(1804289383));
        assertEquals(65535, instance.arrangeCoins(2147483647));
    }
}
