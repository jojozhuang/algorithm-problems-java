package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution268;

public class Solution268Test extends JunitBase {

    @Test
    public void testMissingNumber() {
        System.out.println("missingNumber");
        Solution268 instance = new Solution268();

        assertEquals(0, instance.missingNumber(null));
        assertEquals(2, instance.missingNumber(new int[]{0,1,3}));
        assertEquals(3, instance.missingNumber(new int[]{0,1,2,4}));
        assertEquals(5, instance.missingNumber(new int[]{0,1,2,3,4,6,7,8,9,10}));
    }
}
