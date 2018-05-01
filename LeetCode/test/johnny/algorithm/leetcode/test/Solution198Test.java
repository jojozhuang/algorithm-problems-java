package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution198;

public class Solution198Test extends JunitBase {

    @Test
    public void testRob() {
        System.out.println("rob");
        Solution198 instance = new Solution198();

        assertEquals(0, instance.rob(null));
        assertEquals(1, instance.rob(new int[]{1}));
        assertEquals(2, instance.rob(new int[]{1,2}));
        assertEquals(3, instance.rob(new int[]{1,3,1}));
        assertEquals(2, instance.rob(new int[]{1,1,1,1}));
        assertEquals(4, instance.rob(new int[]{1,2,3}));
        assertEquals(13, instance.rob(new int[]{1,4,5,6,7}));
    }
}
