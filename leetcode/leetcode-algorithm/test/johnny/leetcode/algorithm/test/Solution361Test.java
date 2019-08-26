package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution361;

public class Solution361Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxKilledEnemies");
        Solution361 instance = new Solution361();

        char[][] grid1 = new char[][] {
            {'0', 'E', '0', '0'},
            {'E', '0', 'W', 'E'},
            {'0', 'E', '0', '0'}};
        assertEquals(3, instance.maxKilledEnemies(grid1));
    }
}
