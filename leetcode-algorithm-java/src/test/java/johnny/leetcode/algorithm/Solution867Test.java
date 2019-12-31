package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution867;

public class Solution867Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("transpose");
        Solution867 instance = new Solution867();

        int[][] A1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expect1 = new int[][] {{1,4,7},{2,5,8},{3,6,9}};
        assertArrayEquals(expect1, instance.transpose(A1));
        
        int[][] A2 = new int[][] {{1,2,3},{4,5,6}};
        int[][] expect2 = new int[][] {{1,4},{2,5},{3,6}};
        assertArrayEquals(expect2, instance.transpose(A2));
    }
}
