package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution063;

public class Solution063Test extends JunitBase {

    @Test
    public void testUniquePathsWithObstacles() {
        System.out.println("uniquePathsWithObstacles");
        Solution063 instance = new Solution063();

        assertEquals(0, instance.uniquePathsWithObstacles(null));
        assertEquals(2, instance.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
        assertEquals(0, instance.uniquePathsWithObstacles(new int[][]{{1,0,0},{0,1,0},{0,0,0}}));
    }
}
