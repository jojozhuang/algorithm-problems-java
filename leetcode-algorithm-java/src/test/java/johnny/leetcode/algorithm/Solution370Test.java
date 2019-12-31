package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution370;

public class Solution370Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("getModifiedArray");
        Solution370 instance = new Solution370();

        int[][] updates1 = new int[][] {
            {1,  3,  2},
            {2,  4,  3},
            {0,  2, -2}};
        assertArrayEquals(new int[] {-2, 0, 3, 5, 3}, instance.getModifiedArray(5, updates1));
    }
}
