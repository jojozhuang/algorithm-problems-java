package johnny.lintcode.algorithm;

import johnny.algorithm.common.Point;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightShortestPathTest extends JunitBase {

    @Test
    public void testShortestPath() {
        System.out.println("shortestPath");
        KnightShortestPath instance = new KnightShortestPath();

        int[][] grid1 = new int[][]{
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        assertEquals(2, instance.shortestPath(grid1, new Point(2,0), new Point(2,2)));

        int[][] grid2 = new int[][]{
                {0,1,0},
                {0,0,1},
                {0,0,0}
        };
        assertEquals(-1, instance.shortestPath(grid2, new Point(2,0), new Point(2,2)));
    }
    
}
