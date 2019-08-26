package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution873;

public class Solution873Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("lenLongestFibSubseq");
        Solution873 instance = new Solution873();

        assertEquals(5, instance.lenLongestFibSubseq(new int[] {1,2,3,4,5,6,7,8}));
        assertEquals(3, instance.lenLongestFibSubseq(new int[] {1,3,7,11,12,14,18}));
    }
}
