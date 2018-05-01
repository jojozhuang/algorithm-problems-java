package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution321;

public class Solution321Test extends JunitBase {

    @Test
    public void testMaxNumber() {
        System.out.println("maxNumber");
        Solution321 instance = new Solution321();

        assertArrayEquals(null, instance.maxNumber(null, null, 0));
        assertArrayEquals(new int[]{9, 8, 6, 5, 3}, instance.maxNumber(new int[]{3, 4, 6, 5}, new int[]{9, 1, 2, 5, 8, 3}, 5));
        assertArrayEquals(new int[]{6, 7, 6, 0, 4}, instance.maxNumber(new int[]{6,7}, new int[]{6,0,4}, 5));
        assertArrayEquals(new int[]{9, 8, 9}, instance.maxNumber(new int[]{3, 9}, new int[]{8,9}, 3));
    }
}
