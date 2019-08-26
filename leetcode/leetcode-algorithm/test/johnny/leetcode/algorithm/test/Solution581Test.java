package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution581;

public class Solution581Test extends JunitBase {

    @Test
    public void testFindUnsortedSubarray() {
        System.out.println("findUnsortedSubarray");
        Solution581 instance = new Solution581();

        assertEquals(0, instance.findUnsortedSubarray(new int[]{}));
        assertEquals(0, instance.findUnsortedSubarray(new int[]{1}));
        assertEquals(0, instance.findUnsortedSubarray(new int[]{1,2}));
        assertEquals(2, instance.findUnsortedSubarray(new int[]{2,1}));
        assertEquals(0, instance.findUnsortedSubarray(new int[]{1,2,3,4}));
        assertEquals(3, instance.findUnsortedSubarray(new int[]{2,3,3,2,4}));
        assertEquals(5, instance.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }
}
