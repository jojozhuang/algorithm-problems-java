package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution391;

public class Solution391Test {

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
        System.out.println("isRectangleCover");
        Solution391 instance = new Solution391();

        int[][] rectangles1 = new int[][] {
            {1,1,3,3},
            {3,1,4,2},
            {3,2,4,4},
            {1,3,2,4},
            {2,3,3,4}
        };
        assertEquals(true, instance.isRectangleCover(rectangles1));

        int[][] rectangles2 = new int[][] {
            {1,1,2,3},
            {1,3,2,4},
            {3,1,4,2},
            {3,2,4,4}
        };
        assertEquals(false, instance.isRectangleCover(rectangles2));

        int[][] rectangles3 = new int[][] {
            {1,1,3,3},
            {3,1,4,2},
            {1,3,2,4},
            {3,2,4,4}
        };
        assertEquals(false, instance.isRectangleCover(rectangles3));

        int[][] rectangles4 = new int[][] {
            {1,1,3,3},
            {3,1,4,2},
            {1,3,2,4},
            {2,2,4,4}
        };
        assertEquals(false, instance.isRectangleCover(rectangles4));
}

}
