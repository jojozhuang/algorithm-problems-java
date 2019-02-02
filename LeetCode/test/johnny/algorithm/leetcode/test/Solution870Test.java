package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution870;

public class Solution870Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("advantageCount");
        Solution870 instance = new Solution870();

        assertArrayEquals(new int[] {2,11,7,15}, instance.advantageCount(new int[] {2,7,11,15}, new int[] {1,10,4,11}));
        assertArrayEquals(new int[] {24,32,8,12}, instance.advantageCount(new int[] {12,24,8,32}, new int[] {13,25,32,11}));
    }
}
