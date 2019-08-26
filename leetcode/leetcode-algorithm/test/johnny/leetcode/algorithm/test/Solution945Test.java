package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution945;

public class Solution945Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minIncrementForUnique");
        Solution945 instance = new Solution945();

        assertEquals(1, instance.minIncrementForUnique(new int[] {1,2,2}));
        assertEquals(6, instance.minIncrementForUnique(new int[] {3,2,1,2,1,7}));
        assertEquals(6, instance.minIncrementForUnique(new int[] {1,1,1,1}));
    }
}
