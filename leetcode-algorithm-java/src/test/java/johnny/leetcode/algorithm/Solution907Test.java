package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution907;

public class Solution907Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sumSubarrayMins");
        Solution907 instance = new Solution907();

        assertEquals(17, instance.sumSubarrayMins(new int[] {3,1,2,4}));
    }
}