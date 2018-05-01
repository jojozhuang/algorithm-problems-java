package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution136;

public class Solution136Test extends JunitBase {

    @Test
    public void testSingleNumber() {
        System.out.println("singleNumber");
        Solution136 instance = new Solution136();

        assertEquals(0, instance.singleNumber(null));
        assertEquals(1, instance.singleNumber(new int[] {1}));
        assertEquals(0, instance.singleNumber(new int[] {1,0,1}));
        assertEquals(2, instance.singleNumber(new int[] {1,3,1,2,3}));
        assertEquals(4, instance.singleNumber(new int[] {1,2,2,1,3,4,3}));
    }
}
