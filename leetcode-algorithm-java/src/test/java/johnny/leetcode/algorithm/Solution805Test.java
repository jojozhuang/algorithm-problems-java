package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution805;

public class Solution805Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("splitArraySameAverage");
        Solution805 instance = new Solution805();

        assertEquals(true, instance.splitArraySameAverage(new int[] {1,2,3,4,5,6,7,8}));
    }
}
