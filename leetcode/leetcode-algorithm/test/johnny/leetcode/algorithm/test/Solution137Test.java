package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution137;

public class Solution137Test extends JunitBase {

    @Test
    public void testSingleNumber() {
        System.out.println("singleNumber");
        Solution137 instance = new Solution137();

        assertEquals(0, instance.singleNumber(null));
        assertEquals(1, instance.singleNumber(new int[]{1}));
        assertEquals(2, instance.singleNumber(new int[]{1,2,1,1}));
        assertEquals(3, instance.singleNumber(new int[]{2,2,1,2,1,1,3}));
        assertEquals(4, instance.singleNumber(new int[]{1,1,2,3,3,3,2,2,4,1}));
    }
}
