package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution628;

public class Solution628Test extends JunitBase {

    @Test
    public void testMaximumProduct() {
        System.out.println("maximumProduct");
        Solution628 instance = new Solution628();

        assertEquals(Integer.MIN_VALUE, instance.maximumProduct(new int[]{}));
        assertEquals(Integer.MIN_VALUE, instance.maximumProduct(new int[]{1}));
        assertEquals(6, instance.maximumProduct(new int[]{1,2,3}));
        assertEquals(0, instance.maximumProduct(new int[]{-1,0,1}));
        assertEquals(36, instance.maximumProduct(new int[]{-4,-3,2,3}));
        assertEquals(24, instance.maximumProduct(new int[]{1,2,3,4}));
        assertEquals(0, instance.maximumProduct(new int[]{-4,-3,-2,-1,0}));
        assertEquals(-6, instance.maximumProduct(new int[]{-4,-3,-2,-1}));
        assertEquals(18, instance.maximumProduct(new int[]{-3,-2,0,1,2,3}));
    }
}
