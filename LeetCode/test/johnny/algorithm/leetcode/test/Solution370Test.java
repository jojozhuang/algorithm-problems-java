package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution370;

public class Solution370Test {

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
        System.out.println("getModifiedArray");
        Solution370 instance = new Solution370();

        int[][] updates1 = new int[][] {
            {1,  3,  2},
            {2,  4,  3},
            {0,  2, -2}};
        assertArrayEquals(new int[] {-2, 0, 3, 5, 3}, instance.getModifiedArray(5, updates1));
    }

}
