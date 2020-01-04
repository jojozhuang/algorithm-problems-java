package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution330Test extends JunitBase {

    @Test
    public void testMinPatches() {
        System.out.println("minPatches");
        Solution330 instance = new Solution330();

        assertEquals(0, instance.minPatches(null, 0));
        assertEquals(3, instance.minPatches(new int[]{}, 7));
        assertEquals(1, instance.minPatches(new int[]{1, 3}, 6));
        assertEquals(2, instance.minPatches(new int[]{1, 5, 10}, 20));
        assertEquals(0, instance.minPatches(new int[]{1, 2, 2}, 5));
        assertEquals(28, instance.minPatches(new int[]{1,2,31,33},2147483647));
    }
}
