package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution496Test extends JunitBase {

    @Test
    public void testNextGreaterElement() {
        System.out.println("nextGreaterElement");
        Solution496 instance = new Solution496();

        assertArrayEquals(new int[]{}, instance.nextGreaterElement(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{-1}, instance.nextGreaterElement(new int[]{1}, new int[]{1}));
        assertArrayEquals(new int[]{-1}, instance.nextGreaterElement(new int[]{2}, new int[]{1,2}));
        assertArrayEquals(new int[]{2,3}, instance.nextGreaterElement(new int[]{1,2}, new int[]{1,2,3}));
        assertArrayEquals(new int[]{2,3,4}, instance.nextGreaterElement(new int[]{1,2,3}, new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{-1,-1,-1}, instance.nextGreaterElement(new int[]{3,2,1}, new int[]{4,3,2,1}));
        assertArrayEquals(new int[]{-1,3,-1}, instance.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
        assertArrayEquals(new int[]{3,-1}, instance.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4}));
    }
    
    @Test
    public void testNextRightLarge() {
        System.out.println("nextRightLarge");
        Solution496 instance = new Solution496();

        assertArrayEquals(new int[]{}, instance.nextRightLarge(new int[]{}));
        assertArrayEquals(new int[]{-1}, instance.nextRightLarge(new int[]{1}));
        assertArrayEquals(new int[]{2,-1}, instance.nextRightLarge(new int[]{1,2}));
        assertArrayEquals(new int[]{2,3,-1}, instance.nextRightLarge(new int[]{1,2,3}));
        assertArrayEquals(new int[]{2,3,4,-1}, instance.nextRightLarge(new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{-1,-1,-1,-1}, instance.nextRightLarge(new int[]{4,3,2,1}));
        assertArrayEquals(new int[]{3,4,-1,-1}, instance.nextRightLarge(new int[]{1,3,4,2}));
    }

    @Test
    public void testNextRightSmall() {
        System.out.println("nextRightSmall");
        Solution496 instance = new Solution496();

        assertArrayEquals(new int[]{}, instance.nextRightSmall(new int[]{}));
        assertArrayEquals(new int[]{-1}, instance.nextRightSmall(new int[]{1}));
        assertArrayEquals(new int[]{-1,-1}, instance.nextRightSmall(new int[]{1,2}));
        assertArrayEquals(new int[]{-1,-1,-1}, instance.nextRightSmall(new int[]{1,2,3}));
        assertArrayEquals(new int[]{-1,-1,-1,-1}, instance.nextRightSmall(new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{3,2,1,-1}, instance.nextRightSmall(new int[]{4,3,2,1}));
        assertArrayEquals(new int[]{-1,2,2,-1}, instance.nextRightSmall(new int[]{1,3,4,2}));
    }

    @Test
    public void testNextLeftLarge() {
        System.out.println("nextLeftLarge");
        Solution496 instance = new Solution496();

        assertArrayEquals(new int[]{}, instance.nextLeftLarge(new int[]{}));
        assertArrayEquals(new int[]{-1}, instance.nextLeftLarge(new int[]{1}));
        assertArrayEquals(new int[]{-1,-1}, instance.nextLeftLarge(new int[]{1,2}));
        assertArrayEquals(new int[]{-1,-1,-1}, instance.nextLeftLarge(new int[]{1,2,3}));
        assertArrayEquals(new int[]{-1,-1,-1,-1}, instance.nextLeftLarge(new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{-1,4,3,2}, instance.nextLeftLarge(new int[]{4,3,2,1}));
        assertArrayEquals(new int[]{-1,-1,-1,4}, instance.nextLeftLarge(new int[]{1,3,4,2}));
    }

    @Test
    public void testNextLeftSmall() {
        System.out.println("nextLeftSmall");
        Solution496 instance = new Solution496();

        assertArrayEquals(new int[]{}, instance.nextLeftSmall(new int[]{}));
        assertArrayEquals(new int[]{-1}, instance.nextLeftSmall(new int[]{1}));
        assertArrayEquals(new int[]{-1,1}, instance.nextLeftSmall(new int[]{1,2}));
        assertArrayEquals(new int[]{-1,1,2}, instance.nextLeftSmall(new int[]{1,2,3}));
        assertArrayEquals(new int[]{-1,1,2,3}, instance.nextLeftSmall(new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{-1,-1,-1,-1}, instance.nextLeftSmall(new int[]{4,3,2,1}));
        assertArrayEquals(new int[]{-1,1,3,1}, instance.nextLeftSmall(new int[]{1,3,4,2}));
    }
}
