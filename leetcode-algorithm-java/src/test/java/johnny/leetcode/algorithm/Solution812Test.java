package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution812Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestTriangleArea");
        Solution812 instance = new Solution812();

        assertEquals(2, instance.largestTriangleArea(new int[][] {{0,0},{0,1},{1,0},{0,2},{2,0}}), 0.0);
    }
}
