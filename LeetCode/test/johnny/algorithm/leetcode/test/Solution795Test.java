package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution795;

public class Solution795Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSubarrayBoundedMax");
        Solution795 instance = new Solution795();

        assertEquals(3, instance.numSubarrayBoundedMax(new int[] {2, 1, 4, 3}, 2, 3));
    }
}
