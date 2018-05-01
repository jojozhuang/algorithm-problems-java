package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution259;

public class Solution259Test extends JunitBase {

    @Test
    public void testThreeSumSmaller() {
        System.out.println("threeSumSmaller");
        Solution259 instance = new Solution259();

        assertEquals(0, instance.threeSumSmaller(null, 0));
        assertEquals(1, instance.threeSumSmaller(new int[]{-1, 1, -1, -1}, -1));
        assertEquals(2, instance.threeSumSmaller(new int[]{-2, 0, 1, 3}, 2));
        assertEquals(4, instance.threeSumSmaller(new int[]{-2, 0, 1, 2}, 4));
    }
}
