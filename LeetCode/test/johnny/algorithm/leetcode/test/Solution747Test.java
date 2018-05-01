package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution747;

public class Solution747Test extends JunitBase {

    @Test
    public void testDominantIndex() {
        System.out.println("dominantIndex");
        Solution747 instance = new Solution747();

        assertEquals(-1, instance.dominantIndex(null));
        assertEquals(0, instance.dominantIndex(new int[] {1}));
        assertEquals(-1, instance.dominantIndex(new int[] {2, 3}));
        assertEquals(1, instance.dominantIndex(new int[] {0, 4}));
        assertEquals(1, instance.dominantIndex(new int[] {3, 6, 1, 0}));
        assertEquals(-1, instance.dominantIndex(new int[] {1, 2, 3, 4}));
    }
}
