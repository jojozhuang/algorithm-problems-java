package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution260;

public class Solution260Test extends JunitBase {

    @Test
    public void testSingleNumber() {
        System.out.println("singleNumber");
        Solution260 instance = new Solution260();

        assertArrayEquals(null, instance.singleNumber(null));
        assertArrayEquals(new int[]{2,1}, instance.singleNumber(new int[]{1,2}));
        assertArrayEquals(new int[]{2,3}, instance.singleNumber(new int[]{1,2,1,3}));
        assertArrayEquals(new int[]{2,3}, instance.singleNumber(new int[]{1,3,1,2}));
        assertArrayEquals(new int[]{0,4}, instance.singleNumber(new int[]{1,2,1,2,3,3,4,0}));
    }
}
