package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution698;

public class Solution698Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("canPartitionKSubsets");
        Solution698 instance = new Solution698();

        assertEquals(true, instance.canPartitionKSubsets(new int[] {4, 3, 2, 3, 5, 2, 1}, 4));
    }
}
