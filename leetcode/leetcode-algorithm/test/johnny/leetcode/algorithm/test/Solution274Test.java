package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution274;

public class Solution274Test extends JunitBase {

    @Test
    public void testHIndex() {
        System.out.println("hIndex");
        Solution274 instance = new Solution274();

        //assertEquals(0, instance.hIndex(null));
        assertEquals(1, instance.hIndex(new int[]{1,1,1,1,1}));
        assertEquals(3, instance.hIndex(new int[]{3, 0, 6, 1, 5}));
        assertEquals(4, instance.hIndex(new int[]{10, 8, 5, 4, 3}));
        assertEquals(3, instance.hIndex(new int[]{25, 8, 5, 3, 3}));
        assertEquals(5, instance.hIndex(new int[]{10, 10, 10, 10, 10}));
    }
}
