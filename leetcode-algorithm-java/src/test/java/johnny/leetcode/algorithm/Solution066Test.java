package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution066Test extends JunitBase {

    @Test
    public void testPlusOne() {
        System.out.println("plusOne");
        Solution066 instance = new Solution066();

        assertArrayEquals(null, instance.plusOne(null));
        assertArrayEquals(new int[]{1}, instance.plusOne(new int[]{0}));
        assertArrayEquals(new int[]{2}, instance.plusOne(new int[]{1}));
        assertArrayEquals(new int[]{1,0}, instance.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{1,1}, instance.plusOne(new int[]{1,0}));
        assertArrayEquals(new int[]{2,0}, instance.plusOne(new int[]{1,9}));
        assertArrayEquals(new int[]{1,0,0}, instance.plusOne(new int[]{9,9}));
        assertArrayEquals(new int[]{1,0,1}, instance.plusOne(new int[]{1,0,0}));
        assertArrayEquals(new int[]{2,0,0}, instance.plusOne(new int[]{1,9,9}));
        assertArrayEquals(new int[]{9,9,0}, instance.plusOne(new int[]{9,8,9}));
        assertArrayEquals(new int[]{1,0,0,0}, instance.plusOne(new int[]{9,9,9}));
    }
}
