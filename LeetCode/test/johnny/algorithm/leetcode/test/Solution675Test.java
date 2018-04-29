package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution675;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution675Test {

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
        System.out.println("cutOffTree");
        Solution675 instance = new Solution675();

        List<List<Integer>> forest1 = ListUtil.buildList2(new Integer[][] {
            {1,2,3},
            {0,0,4},
            {7,6,5}});
        assertEquals(6, instance.cutOffTree(forest1));
        
        List<List<Integer>> forest2 = ListUtil.buildList2(new Integer[][] {
            {1,2,3},
            {0,0,0},
            {7,6,5}});
        assertEquals(-1, instance.cutOffTree(forest2));

        List<List<Integer>> forest3 = ListUtil.buildList2(new Integer[][] {
            {2,3,4},
            {0,0,5},
            {8,7,6}});
        assertEquals(6, instance.cutOffTree(forest3));
    }

}
