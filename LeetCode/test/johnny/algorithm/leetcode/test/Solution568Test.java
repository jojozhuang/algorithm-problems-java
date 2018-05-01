package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution568;

public class Solution568Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxVacationDays");
        Solution568 instance = new Solution568();

        int[][] flights1 = new int[][] {{0,1,1},{1,0,1},{1,1,0}};
        int[][] days1 = new int[][] {{1,3,1},{6,0,3},{3,3,3}};
        assertEquals(12, instance.maxVacationDays(flights1, days1));

        int[][] flights2 = new int[][] {{0,0,0},{0,0,0},{0,0,0}};
        int[][] days2 = new int[][] {{1,1,1},{7,7,7},{7,7,7}};
        assertEquals(3, instance.maxVacationDays(flights2, days2));

        int[][] flights3 = new int[][] {{0,1,1},{1,0,1},{1,1,0}};
        int[][] days3 = new int[][] {{7,0,0},{0,7,0},{0,0,7}};
        assertEquals(21, instance.maxVacationDays(flights3, days3));
    }
}
