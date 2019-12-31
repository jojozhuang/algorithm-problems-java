package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution780;

public class Solution780Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("reachingPoints");
        Solution780 instance = new Solution780();

        assertEquals(true, instance.reachingPoints(1,1,3,5));
        assertEquals(false, instance.reachingPoints(1,1,2,2));
        assertEquals(true, instance.reachingPoints(1,1,1,1));
    }
}
