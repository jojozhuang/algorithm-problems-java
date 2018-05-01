package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution365;

public class Solution365Test extends JunitBase {

    @Test
    public void testCanMeasureWater() {
        System.out.println("canMeasureWater");
        Solution365 instance = new Solution365();

        assertEquals(true, instance.canMeasureWater(0, 0, 0));
        assertEquals(true, instance.canMeasureWater(3, 5, 4));
        assertEquals(false, instance.canMeasureWater(2, 6, 5));
    }
}
