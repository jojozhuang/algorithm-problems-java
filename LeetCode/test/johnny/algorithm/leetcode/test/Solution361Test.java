package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution361;

public class Solution361Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

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
