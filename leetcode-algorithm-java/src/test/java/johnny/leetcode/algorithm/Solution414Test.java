package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution414;

public class Solution414Test extends JunitBase {

    @Test
    public void testThirdMax() {
        System.out.println("thirdMax");
        Solution414 instance = new Solution414();

        assertEquals(2, instance.thirdMax(new int[]{1,2,2,5,3,5}));
        assertEquals(0, instance.thirdMax(new int[]{}));
        assertEquals(1, instance.thirdMax(new int[]{1}));
        assertEquals(1, instance.thirdMax(new int[]{2,1,3}));
        assertEquals(1, instance.thirdMax(new int[]{3,2,1}));
        assertEquals(2, instance.thirdMax(new int[]{1,2}));
        assertEquals(1, instance.thirdMax(new int[]{2,2,3,1}));
        assertEquals(-2147483648, instance.thirdMax(new int[]{-2147483648}));
        assertEquals(-2147483648, instance.thirdMax(new int[]{-2147483648,1,2}));
        assertEquals(1, instance.thirdMax(new int[]{-2147483648,1,1}));
    }
}
