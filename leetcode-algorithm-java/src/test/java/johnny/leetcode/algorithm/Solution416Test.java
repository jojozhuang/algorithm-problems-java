package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution416Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("canPartition");
        Solution416 instance = new Solution416();

        assertEquals(true, instance.canPartition(new int[] {1, 5, 11, 5}));
        assertEquals(false, instance.canPartition(new int[] {1, 2, 3, 5}));
    }
}
