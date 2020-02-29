package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZombieInMatrixTest extends JunitBase {

    @Test
    public void testMinHours() {
        System.out.println("minHours");
        ZombieInMatrix instance = new ZombieInMatrix();

        int[][] grid1 = new int[][] {
            {0, 1, 1, 0, 1},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0}
        };
        assertEquals(2, instance.minHours(grid1));

        int[][] grid2 = new int[][] {
                {0,1,2,0,0},
                {1,0,0,2,1},
                {0,1,0,0,0}
        };
        assertEquals(2, instance.minHours(grid2));

        int[][] grid3 = new int[][] {
                {0,0,0},
                {0,0,0},
                {0,0,1}
        };
        assertEquals(4, instance.minHours(grid3));
    }
}
