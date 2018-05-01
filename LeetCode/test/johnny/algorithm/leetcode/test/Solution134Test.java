package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution134;

public class Solution134Test extends JunitBase {

    @Test
    public void testCanCompleteCircuit() {
        System.out.println("canCompleteCircuit");
        Solution134 instance = new Solution134();

        assertEquals(-1, instance.canCompleteCircuit(null, null));
        assertEquals(0, instance.canCompleteCircuit(new int[]{1,2,3}, new int[]{1,1,1}));
        assertEquals(-1, instance.canCompleteCircuit(new int[]{1,2,3}, new int[]{1,5,1}));
        assertEquals(2, instance.canCompleteCircuit(new int[]{1,2,3}, new int[]{1,4,1}));
    }
}
