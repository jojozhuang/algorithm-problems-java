package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution802;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution802Test {

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
        System.out.println("eventualSafeNodes");
        Solution802 instance = new Solution802();

        int[][] graph1 = new int[][] {{1,2},{2,3},{5},{0},{5},{},{}};
        List<Integer> result1 = ListUtil.buildIntegerList(new Integer[] {2,4,5,6});
        assertEquals(result1, instance.eventualSafeNodes(graph1));
    }

}
