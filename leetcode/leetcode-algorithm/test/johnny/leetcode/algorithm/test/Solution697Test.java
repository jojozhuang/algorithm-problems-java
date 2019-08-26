package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution697;

public class Solution697Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findShortestSubArray");
        Solution697 instance = new Solution697();

        assertEquals(2, instance.findShortestSubArray(new int[] {1, 2, 2, 3, 1}));
        assertEquals(6, instance.findShortestSubArray(new int[] {1,2,2,3,1,4,2}));
    }
}
