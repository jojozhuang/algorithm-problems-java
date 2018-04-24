package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution533;

public class Solution533Test {

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
        System.out.println("findBlackPixel");
        Solution533 instance = new Solution533();

        char[][] picture1 = new char[][] {
            {'W', 'B', 'W', 'B', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'B', 'W'},
            {'W', 'W', 'B', 'W', 'B', 'W'}
        };
        assertEquals(6, instance.findBlackPixel(picture1,3));
    }

}
