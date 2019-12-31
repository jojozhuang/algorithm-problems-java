package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution167;

public class Solution167Test extends JunitBase {

    @Test
    public void testTwoSum() {
        System.out.println("twoSum");
        Solution167 instance = new Solution167();

        assertArrayEquals(new int[]{-1,-1}, instance.twoSum(null, 0));
        assertArrayEquals(new int[]{1,2}, instance.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}
