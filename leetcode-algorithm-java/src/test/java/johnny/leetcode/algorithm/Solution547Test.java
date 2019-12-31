package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution547;

public class Solution547Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findCircleNum");
        Solution547 instance = new Solution547();

        assertEquals(2, instance.findCircleNum(new int[][] {{1,1,0},{1,1,0},{0,0,1}}));
        assertEquals(1, instance.findCircleNum(new int[][] {{1,1,0},{1,1,1},{0,1,1}}));
        assertEquals(1, instance.findCircleNum(new int[][] {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}}));
    }
}
