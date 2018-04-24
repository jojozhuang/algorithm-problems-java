package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution469;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution469Test {

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
        System.out.println("isConvex");
        Solution469 instance = new Solution469();

        List<List<Integer>> points1 = ListUtil.buildList2(new Integer[][] {{0,0},{0,1},{1,1},{1,0}});
        assertEquals(true, instance.isConvex(points1));

        List<List<Integer>> points2 = ListUtil.buildList2(new Integer[][] {{0,0},{0,10},{10,10},{10,0},{5,5}});
        assertEquals(false, instance.isConvex(points2));
    }

}
