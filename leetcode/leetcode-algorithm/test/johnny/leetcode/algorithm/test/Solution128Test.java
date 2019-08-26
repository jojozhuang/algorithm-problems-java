package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution128;

public class Solution128Test extends JunitBase {

    @Test
    public void testLongestConsecutive() {
        System.out.println("longestConsecutive");
        Solution128 instance = new Solution128();

        assertEquals(0, instance.longestConsecutive(null));
        assertEquals(1, instance.longestConsecutive(new int[] {0}));
        assertEquals(1, instance.longestConsecutive(new int[] {0,0}));
        assertEquals(4, instance.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
        assertEquals(4, instance.longestConsecutive(new int[] {1, 9, 3, 10, 4, 20, 2}));
        assertEquals(5, instance.longestConsecutive(new int[] {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}));
    }
}
