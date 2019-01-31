package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution930;

public class Solution930Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSubarraysWithSum");
        Solution930 instance = new Solution930();

        assertEquals(4, instance.numSubarraysWithSum(new int[] {1,0,1,0,1}, 2));
    }
}
