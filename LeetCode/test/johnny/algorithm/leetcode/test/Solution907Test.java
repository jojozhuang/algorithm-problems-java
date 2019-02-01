package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution907;

public class Solution907Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sumSubarrayMins");
        Solution907 instance = new Solution907();

        assertEquals(17, instance.sumSubarrayMins(new int[] {3,1,2,4}));
    }
}
