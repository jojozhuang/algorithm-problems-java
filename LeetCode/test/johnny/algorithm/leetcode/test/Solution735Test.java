package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution735;

public class Solution735Test {

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
        System.out.println("asteroidCollision");
        Solution735 instance = new Solution735();

        assertArrayEquals(new int[] {5, 10}, instance.asteroidCollision(new int[] {5, 10, -5}));
        assertArrayEquals(new int[] {}, instance.asteroidCollision(new int[] {8, -8}));
        assertArrayEquals(new int[] {10}, instance.asteroidCollision(new int[] {10, 2, -5}));
        assertArrayEquals(new int[] {-2, -1, 1, 2}, instance.asteroidCollision(new int[] {-2, -1, 1, 2}));
    }

}
