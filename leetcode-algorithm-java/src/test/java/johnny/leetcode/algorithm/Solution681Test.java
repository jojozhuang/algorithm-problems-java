package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution681;

public class Solution681Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("nextClosestTime");

        Solution681 instance1 = new Solution681();
        assertEquals("19:39", instance1.nextClosestTime("19:34"));

        Solution681 instance2 = new Solution681();
        assertEquals("22:22", instance2.nextClosestTime("23:59"));
    }
}
