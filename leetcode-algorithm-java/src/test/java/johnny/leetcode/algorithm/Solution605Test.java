package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution605Test extends JunitBase {

    @Test
    public void testCanPlaceFlowers() {
        System.out.println("canPlaceFlowers");
        Solution605 instance = new Solution605();

        assertEquals(false, instance.canPlaceFlowers(null, 0));
        assertEquals(true, instance.canPlaceFlowers(new int[]{0}, 1));
        assertEquals(false, instance.canPlaceFlowers(new int[]{0}, 2));
        assertEquals(false, instance.canPlaceFlowers(new int[]{1}, 1));
        assertEquals(false, instance.canPlaceFlowers(new int[]{0,1}, 1));
        assertEquals(true, instance.canPlaceFlowers(new int[]{0,0}, 1));
        assertEquals(false, instance.canPlaceFlowers(new int[]{0,0}, 2));
        assertEquals(true, instance.canPlaceFlowers(new int[]{1,0,0}, 1));
        assertEquals(true, instance.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        assertEquals(false, instance.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
        assertEquals(true, instance.canPlaceFlowers(new int[]{1,0,0,0,0,0,1}, 2));
        assertEquals(true, instance.canPlaceFlowers(new int[]{1,0,1,0,1,0,1}, 0));
    }
}
