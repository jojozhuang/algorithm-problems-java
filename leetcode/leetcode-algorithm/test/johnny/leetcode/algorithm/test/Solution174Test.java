package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution174;

public class Solution174Test extends JunitBase {

    @Test
    public void testCalculateMinimumHP() {
        System.out.println("calculateMinimumHP");
        Solution174 instance = new Solution174();

        assertEquals(0, instance.calculateMinimumHP(null));

        int[][] dungeon2 = new int[][] {
            {-2,-3,3},
            {-5,-10,1},
            {10,30,-5},
        };
        assertEquals(7, instance.calculateMinimumHP(dungeon2));

        int[][] dungeon3 = new int[][] {
            {1,1,1},
            {1,1,1},
            {1,1,1},
        };
        assertEquals(1, instance.calculateMinimumHP(dungeon3));

        int[][] dungeon4 = new int[][] {
            {-200},
        };
        assertEquals(201, instance.calculateMinimumHP(dungeon4));

        int[][] dungeon5 = new int[][] {
            {-3},
            {1}
        };
        assertEquals(4, instance.calculateMinimumHP(dungeon5));

        int[][] dungeon6 = new int[][] {
            {2,-6}
        };
        assertEquals(5, instance.calculateMinimumHP(dungeon6));
    }
}
