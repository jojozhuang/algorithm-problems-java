package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution300;

public class Solution300Test extends JunitBase {

    @Test
    public void testLengthOfLIS() {
        System.out.println("lengthOfLIS");
        Solution300 instance = new Solution300();

        assertEquals(0, instance.lengthOfLIS(null));
        assertEquals(1, instance.lengthOfLIS(new int[]{1}));
        assertEquals(3, instance.lengthOfLIS(new int[]{1,2,3}));
        assertEquals(3, instance.lengthOfLIS(new int[]{1,4,2,3}));
        assertEquals(2, instance.lengthOfLIS(new int[]{5,2,1,3}));
        assertEquals(4, instance.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(3, instance.lengthOfLIS(new int[]{5, 4, 1, 2, 3}));
        assertEquals(4, instance.lengthOfLIS(new int[]{4, 2, 4, 5, 3, 7}));
    }
}
