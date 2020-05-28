package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution986Test extends JunitBase {

    @Test
    public void testAddNum() {
        System.out.println("intervalIntersection");
        Solution986 instance = new Solution986();

        int[][] A1 = new int[][] {{0,2},{5,10},{13,23},{24,25}};
        int[][] B1 = new int[][] {{1,5},{8,12},{15,24},{25,26}};
        int[][] result1 = instance.intervalIntersection(A1, B1);
        int[][] expect1 = new int[][] {{1,2},{5,5},{8,10},{15,23},{24,24},{25,25}};
        assertArrayEquals(expect1, result1);
    }
}
