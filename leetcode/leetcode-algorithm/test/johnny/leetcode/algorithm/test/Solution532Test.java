package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution532;

public class Solution532Test extends JunitBase {

    @Test
    public void testFindPairs() {
        System.out.println("findPairs");
        Solution532 instance = new Solution532();

        assertEquals(0, instance.findPairs(new int[]{}, 1));
        assertEquals(1, instance.findPairs(new int[]{1,2}, 1));
        assertEquals(1, instance.findPairs(new int[]{1,1,1}, 0));
        assertEquals(1, instance.findPairs(new int[]{1,1,1,3,3}, 2));
        assertEquals(2, instance.findPairs(new int[]{1,1,1,2,3,3,4}, 2));
        assertEquals(2, instance.findPairs(new int[]{3,1,4,1,5}, 2));
        assertEquals(4, instance.findPairs(new int[]{1,2,3,4,5}, 1));
        assertEquals(1, instance.findPairs(new int[]{1,1,1,1,4}, 0));
        assertEquals(1, instance.findPairs(new int[]{1,3,1,5,4}, 0));
    }
}
