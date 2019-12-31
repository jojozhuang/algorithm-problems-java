package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution378;

public class Solution378Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("kthSmallest");
        Solution378 instance = new Solution378();

        int[][] matrix1 = new int[][] {
            { 1,  5,  9},
            {10, 11, 13},
            {12, 13, 15}
        };
        assertEquals(13, instance.kthSmallest(matrix1, 8));
    }
}
