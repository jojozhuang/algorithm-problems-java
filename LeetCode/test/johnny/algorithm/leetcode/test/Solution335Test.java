package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution335;

public class Solution335Test extends JunitBase {

    @Test
    public void testIsSelfCrossing() {
        System.out.println("isSelfCrossing");
        Solution335 instance = new Solution335();

        assertEquals(false, instance.isSelfCrossing(null));
        assertEquals(true, instance.isSelfCrossing(new int[]{2, 1, 1, 2}));
        assertEquals(false, instance.isSelfCrossing(new int[]{1, 2, 3, 4}));
        assertEquals(true, instance.isSelfCrossing(new int[]{1,1,1,1}));
    }
}
