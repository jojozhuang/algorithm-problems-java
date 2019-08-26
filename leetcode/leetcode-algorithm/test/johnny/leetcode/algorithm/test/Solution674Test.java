package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution674;

public class Solution674Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLengthOfLCIS");
        Solution674 instance = new Solution674();

        assertEquals(3, instance.findLengthOfLCIS(new int[] {1,3,5,4,7}));
        assertEquals(1, instance.findLengthOfLCIS(new int[] {2,2,2,2,2}));
    }
}
