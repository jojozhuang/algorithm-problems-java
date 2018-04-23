package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution368;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution368Test {

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
        System.out.println("largestDivisibleSubset");
        Solution368 instance = new Solution368();

        List<Integer> result1 = instance.largestDivisibleSubset(new int[] {1,2,3});
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1,2});
        assertTrue(ListUtil.equalsIgnoreOrder(result1, expect1));
    }

}
