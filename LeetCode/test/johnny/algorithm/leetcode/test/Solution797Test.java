package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution797;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution797Test {

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
        Solution797 instance = new Solution797();

        int[][] graph1 = new int[][] {{1,2}, {3}, {3}, {}};
        List<List<Integer>> result1 = ListUtil.buildIntegerList2(new Integer[][] {{0,1,3},{0,2,3}});
        assertEquals(result1, instance.allPathsSourceTarget(graph1));
    }

}
