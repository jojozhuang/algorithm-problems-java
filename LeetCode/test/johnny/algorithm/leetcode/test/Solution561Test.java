package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution561;

public class Solution561Test extends JunitBase {

    @Test
    public void testArrayPairSum() {
        System.out.println("arrayPairSum");
        Solution561 instance = new Solution561();

        assertEquals(0, instance.arrayPairSum(new int[]{}));
        assertEquals(1, instance.arrayPairSum(new int[]{1,2}));
        assertEquals(3, instance.arrayPairSum(new int[]{3,0,1,4}));
        assertEquals(4, instance.arrayPairSum(new int[]{1,4,3,2}));
    }
}
