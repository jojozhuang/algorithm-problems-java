package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution888;

public class Solution888Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSimilarGroups");
        Solution888 instance = new Solution888();

        int[] A1 = new int[] {1,1};
        int[] B1 = new int[] {2,2};
        int[] expected1 = new int[] {1,2};
        assertArrayEquals(expected1, instance.fairCandySwap(A1, B1));
        
        int[] A2 = new int[] {1,1};
        int[] B2 = new int[] {2,3};
        int[] expected2 = new int[] {1,2};
        assertArrayEquals(expected2, instance.fairCandySwap(A2, B2));
        
        int[] A3 = new int[] {2};
        int[] B3 = new int[] {1,3};
        int[] expected3 = new int[] {2,3};
        assertArrayEquals(expected3, instance.fairCandySwap(A3, B3));
        
        int[] A4 = new int[] {1,2,5};
        int[] B4 = new int[] {2,4};
        int[] expected4 = new int[] {5,4};
        assertArrayEquals(expected4, instance.fairCandySwap(A4, B4));
    }
}
