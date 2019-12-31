package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution505;

public class Solution505Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("shortestDistance");
        Solution505 instance = new Solution505();

        int[][] maze1 = new int[][] {
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 1, 1},
            {0, 0, 0, 0, 0}
        };
        int[] start1 = new int[] {0,4};
        int[] destination1 = new int[] {4,4};
        assertEquals(12, instance.shortestDistance(maze1,start1,destination1));

        int[][] maze2 = new int[][] {
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 1, 1},
            {0, 0, 0, 0, 0}
        };
        int[] start2 = new int[] {0,4};
        int[] destination2 = new int[] {3,2};
        assertEquals(-1, instance.shortestDistance(maze2,start2,destination2));
    }
}
