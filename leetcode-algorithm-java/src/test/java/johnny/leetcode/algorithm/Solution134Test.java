package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution134Test extends JunitBase {

    @Test
    public void testCanCompleteCircuit() {
        System.out.println("canCompleteCircuit");
        Solution134 instance = new Solution134();

        assertEquals(-1, instance.canCompleteCircuit(null, null));
        assertEquals(3, instance.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
        assertEquals(-1, instance.canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}));
        assertEquals(0, instance.canCompleteCircuit(new int[]{1,2,3}, new int[]{1,1,1}));
        assertEquals(-1, instance.canCompleteCircuit(new int[]{1,2,3}, new int[]{1,5,1}));
        assertEquals(2, instance.canCompleteCircuit(new int[]{1,2,3}, new int[]{1,4,1}));

        assertEquals(-1, instance.canCompleteCircuit(new int[]{4,5,2,6,5,3}, new int[]{3,2,7,3,2,9}));
    }
}
