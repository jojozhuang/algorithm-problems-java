package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureIsland2Test extends JunitBase {

    @Test
    public void testFindPath2() {
        System.out.println("findPath2");
        TreasureIsland2 instance = new TreasureIsland2();

        char[][] grid1 = new char[][] {
            {'S', 'O', 'O', 'S', 'S'},
            {'D', 'O', 'D', 'O', 'D'},
            {'O', 'O', 'O', 'O', 'X'},
            {'X', 'D', 'D', 'O', 'O'},
            {'X', 'D', 'D', 'D', 'O'}
        };
        assertEquals(3, instance.findPath(grid1));

        char[][] grid2 = new char[][] {
            {'S', 'O', 'O', 'S', 'S'},
            {'D', 'X', 'D', 'O', 'D'},
            {'O', 'O', 'O', 'O', 'X'},
            {'X', 'D', 'D', 'O', 'O'},
            {'X', 'D', 'D', 'D', 'O'}
        };
        assertEquals(2, instance.findPath(grid2));

        char[][] grid3 = new char[][] {
            {'S', 'O', 'O', 'S', 'S'},
            {'D', 'O', 'D', 'O', 'D'},
            {'D', 'O', 'O', 'D', 'X'},
            {'X', 'D', 'D', 'O', 'D'},
            {'X', 'D', 'D', 'D', 'O'}
        };
        assertEquals(-1, instance.findPath(grid3));
    }
}
