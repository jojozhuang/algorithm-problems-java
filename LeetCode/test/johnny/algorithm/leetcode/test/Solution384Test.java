package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

import johnny.algorithm.leetcode.Solution384;

public class Solution384Test extends JunitBase {

    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Solution384 instance = new Solution384(new int[]{1,2,3});

        int[] result1 = instance.shuffle();
        Arrays.sort(result1);
        assertArrayEquals(new int[]{1,2,3}, result1);
        assertArrayEquals(new int[]{1,2,3}, instance.reset());
    }
}
