package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution372;

public class Solution372Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("superPow");
        Solution372 instance = new Solution372();

        assertEquals(8, instance.superPow(2, new int[] {3}));
        assertEquals(1024, instance.superPow(2, new int[] {1,0}));
    }
}
