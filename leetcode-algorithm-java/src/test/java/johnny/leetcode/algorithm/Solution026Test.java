package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution026;

public class Solution026Test extends JunitBase {

    @Test
    public void testRemoveDuplicates() {
        System.out.println("removeDuplicates");
        Solution026 instance = new Solution026();

        assertEquals(0, instance.removeDuplicates(null));
        assertEquals(0, instance.removeDuplicates(new int[]{}));
        assertEquals(1, instance.removeDuplicates(new int[]{1}));
        assertEquals(2, instance.removeDuplicates(new int[]{1,2}));
        assertEquals(4, instance.removeDuplicates(new int[]{1,1,2,3,4}));
        assertEquals(2, instance.removeDuplicates(new int[]{1,1,1,1,3}));
        assertEquals(4, instance.removeDuplicates(new int[]{1,1,3,3,4,4,5}));
        assertEquals(7, instance.removeDuplicates(new int[]{1,2,3,4,5,6,7}));
    }
}
