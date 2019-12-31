package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution896;

public class Solution896Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isMonotonic");
        Solution896 instance = new Solution896();

        assertEquals(true, instance.isMonotonic(new int[] {1,2,2,3}));
        assertEquals(true, instance.isMonotonic(new int[] {6,5,4,4}));
        assertEquals(false, instance.isMonotonic(new int[] {1,3,2}));
    }
}
