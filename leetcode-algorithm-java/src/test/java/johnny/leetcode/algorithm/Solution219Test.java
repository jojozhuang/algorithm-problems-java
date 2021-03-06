package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution219Test extends JunitBase {

    @Test
    public void testContainsNearbyDuplicate() {
        System.out.println("containsNearbyDuplicate");
        Solution219 instance = new Solution219();

        assertEquals(false, instance.containsNearbyDuplicate(null, 0));
        assertEquals(false, instance.containsNearbyDuplicate(new int[]{1,2}, 1));
        assertEquals(false, instance.containsNearbyDuplicate(new int[]{1,2,1}, 1));
        assertEquals(true, instance.containsNearbyDuplicate(new int[]{1,2,1}, 2));
        assertEquals(true, instance.containsNearbyDuplicate(new int[]{1,2,3,4,5,1}, 5));
        assertEquals(false, instance.containsNearbyDuplicate(new int[]{1,2,3,4,5,1}, 3));
    }
}
