package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution517;

public class Solution517Test {

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
        System.out.println("findMinMoves");
        Solution517 instance = new Solution517();

        assertEquals(3, instance.findMinMoves(new int[] {1,0,5}));
        assertEquals(2, instance.findMinMoves(new int[] {0,3,0}));
        assertEquals(-1, instance.findMinMoves(new int[] {0,2,0}));
    }

}
