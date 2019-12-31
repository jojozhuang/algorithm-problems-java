package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution499;

public class Solution499Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findShortestWay");
        Solution499 instance = new Solution499();

        int[][] maze1 = new int[][] {
            {0, 0, 0, 0, 0},
            {1, 1, 0, 0, 1},
            {0, 0, 0, 0, 0},
            {1, 1, 0, 0, 1},
            {0, 1, 0, 0, 0}
        };
        int[] ball1 = new int[] {4,3};
        int[] hole1 = new int[] {0,1};
        assertEquals("lul", instance.findShortestWay(maze1,ball1,hole1));

        int[][] maze2 = new int[][] {
            {0, 0, 0, 0, 0},
            {1, 1, 0, 0, 1},
            {0, 0, 0, 0, 0},
            {1, 1, 0, 0, 1},
            {0, 1, 0, 0, 0}
        };
        int[] ball2 = new int[] {4,3};
        int[] hole2 = new int[] {3,0};
        assertEquals("impossible", instance.findShortestWay(maze2,ball2,hole2));
    }
}
