package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZombieInMatrixTest extends JunitBase {

    @Test
    public void testZombieInMatrix() {
        System.out.println("ZombieInMatrix");
        ZombieInMatrix instance = new ZombieInMatrix();

        int[][] grid1 = new int[][] {
            {0, 1, 1, 0, 1},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0}
        };
        assertEquals(2, instance.minHours(grid1));
    }
}
