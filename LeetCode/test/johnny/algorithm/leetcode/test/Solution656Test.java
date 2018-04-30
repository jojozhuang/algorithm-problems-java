package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution656;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution656Test {

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
        System.out.println("cheapestJump");
        Solution656 instance = new Solution656();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1,3,5});
        assertEquals(expect1, instance.cheapestJump(new int[] {1,2,4,-1,2},2));
    }
}
