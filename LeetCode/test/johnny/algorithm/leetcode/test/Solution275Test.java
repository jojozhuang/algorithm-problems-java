package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution275;

public class Solution275Test extends JunitBase {

    @Test
    public void testHIndex() {
        System.out.println("hIndex");
        Solution275 instance = new Solution275();

        assertEquals(0, instance.hIndex(null));
        assertEquals(0, instance.hIndex(new int[]{0}));
        assertEquals(1, instance.hIndex(new int[]{1,1,1,1,1}));
        assertEquals(2, instance.hIndex(new int[]{2,2,2,2,2}));
        assertEquals(3, instance.hIndex(new int[]{0, 1, 3, 5, 6}));
        assertEquals(4, instance.hIndex(new int[]{3, 4, 5, 8, 10}));
        assertEquals(3, instance.hIndex(new int[]{3, 3, 5, 8, 25}));
        assertEquals(5, instance.hIndex(new int[]{10, 10, 10, 10, 10}));
    }
}
