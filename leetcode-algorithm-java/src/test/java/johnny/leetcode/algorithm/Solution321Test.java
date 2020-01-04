package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution321Test extends JunitBase {

    @Test
    public void testMaxNumber() {
        System.out.println("maxNumber");
        Solution321 instance = new Solution321();

        //assertArrayEquals(null, instance.maxNumber(null, null, 0));
        assertArrayEquals(new int[]{1}, instance.maxNumber(new int[]{}, new int[]{1}, 1));
        assertArrayEquals(new int[]{9, 8, 6, 5, 3}, instance.maxNumber(new int[]{3, 4, 6, 5}, new int[]{9, 1, 2, 5, 8, 3}, 5));
        assertArrayEquals(new int[]{6, 7, 6, 0, 4}, instance.maxNumber(new int[]{6,7}, new int[]{6,0,4}, 5));
        assertArrayEquals(new int[]{9, 8, 9}, instance.maxNumber(new int[]{3, 9}, new int[]{8,9}, 3));
        assertArrayEquals(new int[]{9,7,5}, instance.maxNumber(new int[]{8,6,9}, new int[]{1,7,5}, 3));
    }
}
