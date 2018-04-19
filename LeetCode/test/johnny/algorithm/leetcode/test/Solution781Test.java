package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution781;

public class Solution781Test {

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
        System.out.println("maxIncreaseKeepingSkyline");
        Solution781 instance = new Solution781();

        assertEquals(0, instance.numRabbits(new int[] {}));
        assertEquals(5, instance.numRabbits(new int[] {1, 1, 2}));
        assertEquals(11, instance.numRabbits(new int[] {10, 10, 10}));
    }

}
