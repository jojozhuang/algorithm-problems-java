package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution088;

public class Solution088Test extends JunitBase {

    @Test
    public void testMerge() {
        System.out.println("merge");

        int[] num1 = {1};
        Solution088 instance = new Solution088();
        instance.merge(num1, num1.length, new int[] {}, 0);
        assertArrayEquals(new int[]{1}, num1);

        int[] num12 = new int[2];
        num12[0] = 1;
        instance.merge(num12, 1, new int[]{2}, 1);
        assertArrayEquals(new int[]{1,2}, num12);

        int[] num13 = new int[2];
        num13[0] = 2;
        instance.merge(num13, 1, new int[]{1}, 1);
        assertArrayEquals(new int[]{1,2}, num13);

        int[] num14 = new int[6];
        num14[0] = 4;
        num14[1] = 5;
        num14[2] = 6;
        instance.merge(num14, 3, new int[]{1,2,3}, 3);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, num14);
    }
}
