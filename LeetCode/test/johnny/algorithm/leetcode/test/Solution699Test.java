package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution699;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution699Test {

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
        System.out.println("fallingSquares");
        Solution699 instance = new Solution699();

        int[][] positions1 = {{1, 2}, {2, 3}, {6, 1}};
        List<Integer> result1 = ListUtil.buildList(new Integer[] {2, 5, 5});
        assertEquals(result1, instance.fallingSquares(positions1));
    }

}
