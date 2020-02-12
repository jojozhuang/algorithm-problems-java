package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureIslandTest extends JunitBase {

    @Test
    public void testFindPath() {
        System.out.println("findPath");
        TreasureIsland instance = new TreasureIsland();

        char[][] grid1 = new char[][] {
            {'O', 'O', 'O', 'O'},
            {'D', 'O', 'D', 'O'},
            {'O', 'O', 'O', 'O'},
            {'X', 'D', 'D', 'O'}
        };
        assertEquals(5, instance.findPath(grid1));

        char[][] grid2 = new char[][] {
            {'O', 'O', 'O', 'O'},
            {'D', 'O', 'D', 'O'},
            {'O', 'O', 'O', 'O'},
            {'O', 'D', 'D', 'X'}
        };
        assertEquals(6, instance.findPath(grid2));

        char[][] grid3 = new char[][] {
            {'O', 'O', 'D', 'O'},
            {'O', 'O', 'O', 'O'},
            {'O', 'D', 'O', 'O'},
            {'O', 'X', 'O', 'O'}
        };
        assertEquals(4, instance.findPath(grid3));

        char[][] grid4 = new char[][] {
            {'O', 'O', 'D', 'O'},
            {'O', 'O', 'O', 'O'},
            {'O', 'D', 'O', 'O'},
            {'D', 'X', 'D', 'O'}
        };
        assertEquals(-1, instance.findPath(grid4));
    }
}
