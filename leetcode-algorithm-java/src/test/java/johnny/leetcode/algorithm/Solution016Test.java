package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution016;

public class Solution016Test extends JunitBase {

    @Test
    public void testThreeSumClosest() {
        System.out.println("threeSumClosest");
        Solution016 instance = new Solution016();

        assertEquals(0, instance.threeSumClosest(null, 0));
        assertEquals(2, instance.threeSumClosest(new int[]{-1,2,1,-4}, 1));
        assertEquals(2, instance.threeSumClosest(new int[]{-1,2,1,-4}, 2));
        assertEquals(-3, instance.threeSumClosest(new int[]{-1,2,1,-4}, -3));
        assertEquals(3, instance.threeSumClosest(new int[]{0,1,2}, 3));
    }
}
