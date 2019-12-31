package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution812;

public class Solution812Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestTriangleArea");
        Solution812 instance = new Solution812();

        assertEquals(2, instance.largestTriangleArea(new int[][] {{0,0},{0,1},{1,0},{0,2},{2,0}}), 0.0);
    }
}
