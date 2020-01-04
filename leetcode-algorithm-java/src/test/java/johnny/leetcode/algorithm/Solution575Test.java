package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution575Test extends JunitBase {

    @Test
    public void testDistributeCandies() {
        System.out.println("distributeCandies");
        Solution575 instance = new Solution575();

        assertEquals(0, instance.distributeCandies(new int[]{}));
        assertEquals(0, instance.distributeCandies(new int[]{1}));
        assertEquals(1, instance.distributeCandies(new int[]{1,2}));
        assertEquals(1, instance.distributeCandies(new int[]{1,1}));
        assertEquals(2, instance.distributeCandies(new int[]{1,2,3,4}));
        assertEquals(1, instance.distributeCandies(new int[]{1,1,1,1,1,1}));
        assertEquals(3, instance.distributeCandies(new int[]{1,1,2,2,3,3}));
        assertEquals(2, instance.distributeCandies(new int[]{1,1,2,3}));
    }
}
