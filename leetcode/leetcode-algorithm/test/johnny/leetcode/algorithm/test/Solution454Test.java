package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution454;

public class Solution454Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("fourSumCount");
        Solution454 instance = new Solution454();

        assertEquals(2, instance.fourSumCount(new int[] {1,2,}, new int[] {-2,-1}, new int[] {-1,2}, new int[] {0, 2}));
    }
}
