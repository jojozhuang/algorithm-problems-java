package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution845;

public class Solution845Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("longestMountain");
        Solution845 instance = new Solution845();

        assertEquals(5, instance.longestMountain(new int[] {2,1,4,7,3,2,5}));
        assertEquals(0, instance.longestMountain(new int[] {2,2,2}));
        assertEquals(0, instance.longestMountain(new int[] {1,2,3}));
        assertEquals(3, instance.longestMountain(new int[] {1,2,1}));
        assertEquals(0, instance.longestMountain(new int[] {1,2}));
        assertEquals(3, instance.longestMountain(new int[] {1,2,1,2,3}));
        assertEquals(4, instance.longestMountain(new int[] {1,2,1,2,3,1}));
    }
}
