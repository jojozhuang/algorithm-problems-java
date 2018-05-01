package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution011;

public class Solution011Test extends JunitBase {

    @Test
    public void testMaxArea() {
        System.out.println("maxArea");
        Solution011 instance = new Solution011();

        assertEquals(0, instance.maxArea(new int[]{}));
        assertEquals(4, instance.maxArea(new int[]{2,3,4}));
        assertEquals(6, instance.maxArea(new int[]{1,2,3,4,5}));
        assertEquals(49, instance.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        int[] height2 = new int[15000];
        for(int i=0; i<15000; i++) {
            height2[i] = i+1;
        }
        assertEquals(56250000, instance.maxArea(height2));
    }
}
