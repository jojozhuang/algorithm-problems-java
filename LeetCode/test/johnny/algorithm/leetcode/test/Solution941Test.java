package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution941;

public class Solution941Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validMountainArray");
        Solution941 instance = new Solution941();

        assertEquals(false, instance.validMountainArray(new int[] {2,1}));
        assertEquals(false, instance.validMountainArray(new int[] {3,5,5}));
        assertEquals(true, instance.validMountainArray(new int[] {0,3,2,1}));
        assertEquals(false, instance.validMountainArray(new int[] {2,1,2,3,5,7,9,10,12,14,15,16,18,14,13}));
        assertEquals(false, instance.validMountainArray(new int[] {14,82,89,84,70,70,68}));
        assertEquals(false, instance.validMountainArray(new int[] {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3}));
    }
}
