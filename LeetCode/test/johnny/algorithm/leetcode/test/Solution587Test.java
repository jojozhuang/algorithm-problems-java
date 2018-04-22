package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution587;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.Point;

public class Solution587Test {

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
        System.out.println("outerTrees");
        Solution587 instance = new Solution587();

        Point[] points1 = Point.createArray(new int[][] {{1,1},{2,2},{2,0},{2,4},{3,3},{4,2}});
        List<Point> expResult1 = Point.buildList(new int[][]{{1,1},{2,0},{4,2},{3,3},{2,4}});
        assertTrue(ListUtil.equalLists(expResult1, instance.outerTrees(points1)));

        Point[] points2 = Point.createArray(new int[][] {{1,2},{2,2},{4,2}});
        List<Point> expResult2 = Point.buildList(new int[][]{{1,2},{2,2},{4,2}});
        assertTrue(ListUtil.equalLists(expResult2, instance.outerTrees(points2)));
    }

}
