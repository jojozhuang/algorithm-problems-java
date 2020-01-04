package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution220Test extends JunitBase {

    @Test
    public void testContainsNearbyAlmostDuplicate() {
        System.out.println("containsNearbyAlmostDuplicate");
        Solution220 instance = new Solution220();

        assertEquals(false, instance.containsNearbyAlmostDuplicate(null, 0, 0));
        assertEquals(false, instance.containsNearbyAlmostDuplicate(new int[]{1,8,4,10}, 2, 1));
        assertEquals(false, instance.containsNearbyAlmostDuplicate(new int[]{1,8,4,10}, 1, 3));
        assertEquals(true, instance.containsNearbyAlmostDuplicate(new int[]{1,8,4,10}, 2, 3));
        assertEquals(true, instance.containsNearbyAlmostDuplicate(new int[]{1,8,4,10}, 1, 4));
        assertEquals(true, instance.containsNearbyAlmostDuplicate(new int[]{1,8,4,10}, 2, 2));
    }
}
