package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution643;

public class Solution643Test extends JunitBase {

    @Test
    public void testFindMaxAverage() {
        System.out.println("findMaxAverage");
        Solution643 instance = new Solution643();

        assertEquals(0.0, instance.findMaxAverage(null, 0), 0.0);
        assertEquals(3, instance.findMaxAverage(new int[]{1,2,3}, 1), 0.0000001);
        assertEquals(2.5, instance.findMaxAverage(new int[]{1,2,3}, 2), 0.0000001);
        assertEquals(12.75, instance.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4), 0.0000001);
    }
}
