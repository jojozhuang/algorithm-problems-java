package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution976;

public class Solution976Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestPerimeter");
        Solution976 instance = new Solution976();

        assertEquals(5, instance.largestPerimeter(new int[] {2,1,2}));
        assertEquals(0, instance.largestPerimeter(new int[] {1,2,1}));
        assertEquals(10, instance.largestPerimeter(new int[] {3,2,3,4}));
        assertEquals(8, instance.largestPerimeter(new int[] {3,6,2,3}));
    }
}
