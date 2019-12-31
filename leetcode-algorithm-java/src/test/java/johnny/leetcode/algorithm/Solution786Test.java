package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution786;

public class Solution786Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("kthSmallestPrimeFraction");
        Solution786 instance = new Solution786();

        assertArrayEquals(new int[] {2, 5}, instance.kthSmallestPrimeFraction(new int[] {1, 2, 3, 5}, 3));
        assertArrayEquals(new int[] {1, 7}, instance.kthSmallestPrimeFraction(new int[] {1, 7}, 1));
    }
}
