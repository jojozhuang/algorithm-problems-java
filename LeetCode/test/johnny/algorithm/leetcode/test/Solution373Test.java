package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution373;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution373Test {

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
        System.out.println("kSmallestPairs");
        Solution373 instance = new Solution373();

        List<int[]> result1 = instance.kSmallestPairs(new int[] {1,7,11}, new int[] {2,4,6}, 3);
        List<int[]> expect1 = ListUtil.buildList2(new int[][]{{1,2},{1,4},{1,6}});
        assertArrayEquals(expect1.toArray(), result1.toArray());

        List<int[]> result2 = instance.kSmallestPairs(new int[] {1,1,2}, new int[] {1,2,3}, 2);
        List<int[]> expect2 = ListUtil.buildList2(new int[][]{{1,1},{1,1}});
        assertArrayEquals(expect2.toArray(), result2.toArray());

        List<int[]> result3 = instance.kSmallestPairs(new int[] {1,2}, new int[] {3}, 3);
        List<int[]> expect3 = ListUtil.buildList2(new int[][]{{1,3},{2,3}});
        assertArrayEquals(expect3.toArray(), result3.toArray());
}

}
