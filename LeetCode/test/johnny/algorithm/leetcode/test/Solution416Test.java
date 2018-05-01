package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution416;

public class Solution416Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("canPartition");
        Solution416 instance = new Solution416();

        assertEquals(true, instance.canPartition(new int[] {1, 5, 11, 5}));
        assertEquals(false, instance.canPartition(new int[] {1, 2, 3, 5}));
    }
}
