package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution853;

public class Solution853Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("carFleet");
        Solution853 instance = new Solution853();

        assertEquals(3, instance.carFleet(12, new int[] {10,8,0,5,3}, new int[] {2,4,1,1,3}));
    }
}
