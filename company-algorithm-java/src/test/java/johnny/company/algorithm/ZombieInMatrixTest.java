package johnny.company.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

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

        int[][] grid4 = new int[][] {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        assertEquals(-1, instance.minHours(grid4));
    }

    @Test
    public void testMinHoursList() {
        System.out.println("testMinHoursList");
        ZombieInMatrix instance = new ZombieInMatrix();

        Integer[][] grid1 = new Integer[][] {
                {0, 1, 1, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0}
        };
        List<List<Integer>> list1 = ListUtil.buildList2(grid1);
        assertEquals(2, instance.minHours(list1));

        Integer[][] grid2 = new Integer[][] {
                {0,1,2,0,0},
                {1,0,0,2,1},
                {0,1,0,0,0}
        };
        List<List<Integer>> list2 = ListUtil.buildList2(grid2);
        assertEquals(2, instance.minHours(list2));

        Integer[][] grid3 = new Integer[][] {
                {0,0,0},
                {0,0,0},
                {0,0,1}
        };
        List<List<Integer>> list3 = ListUtil.buildList2(grid3);
        assertEquals(4, instance.minHours(list3));

        Integer[][] grid4 = new Integer[][] {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        List<List<Integer>> list4 = ListUtil.buildList2(grid4);
        assertEquals(-1, instance.minHours(list4));
    }
}
