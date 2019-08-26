package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution080;

public class Solution080Test extends JunitBase {

    @Test
    public void testRemoveDuplicates() {
        System.out.println("removeDuplicates");
        Solution080 instance = new Solution080();

        assertEquals(0, instance.removeDuplicates(null));
        assertEquals(1, instance.removeDuplicates(new int[] {1}));
        assertEquals(2, instance.removeDuplicates(new int[] {1,2}));
        assertEquals(3, instance.removeDuplicates(new int[] {1,2,2}));
        assertEquals(3, instance.removeDuplicates(new int[] {1,2, 3}));
        assertEquals(5, instance.removeDuplicates(new int[] {1,1,1,2,2,3}));
    }
}
