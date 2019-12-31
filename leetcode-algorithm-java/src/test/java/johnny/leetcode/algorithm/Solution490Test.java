package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution490;

public class Solution490Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("hasPath");
        Solution490 instance = new Solution490();

        int[][] maze1 = new int[][] {
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 1, 1},
            {0, 0, 0, 0, 0}
        };
        int[] start1 = new int[] {0,4};
        int[] destination1 = new int[] {4,4};
        assertEquals(true, instance.hasPath(maze1,start1,destination1));

        int[][] maze2 = new int[][] {
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 1, 1},
            {0, 0, 0, 0, 0}
        };
        int[] start2 = new int[] {0,4};
        int[] destination2 = new int[] {3,2};
        assertEquals(false, instance.hasPath(maze2,start2,destination2));
    }
}
