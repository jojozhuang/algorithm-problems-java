package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution041;

public class Solution041Test extends JunitBase {

    @Test
    public void testFirstMissingPositive() {
        System.out.println("firstMissingPositive");
        Solution041 instance = new Solution041();

        assertEquals(1, instance.firstMissingPositive(null));
        assertEquals(2, instance.firstMissingPositive(new int[] {1,1}));
        assertEquals(3, instance.firstMissingPositive(new int[] {1,2,0}));
        assertEquals(2, instance.firstMissingPositive(new int[] {3,4,-1,1}));
    }
}
