package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution286;

public class Solution286Test extends JunitBase {

    @Test
    public void testWallsAndGates() {
        System.out.println("wallsAndGates");
        int inf = Integer.MAX_VALUE;
        int[][] rooms = new int[][]{
            {inf, -1, 0, inf},
            {inf,inf, inf, -1},
            {inf, -1, inf, -1},
            {0, -1, inf, inf}
        };
        Solution286 instance = new Solution286();
        instance.wallsAndGates(rooms);
        int[][] expected = new int[][]{
            {3, -1, 0, 1},
            {2, 2, 1, -1},
            {1, -1, 2, -1},
            {0, -1, 3, 4}
        };
        assertArrayEquals(expected, rooms);
    }
}
