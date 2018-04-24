package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution624;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution624Test {

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
        System.out.println("maxDistance");
        Solution624 instance = new Solution624();

        List<List<Integer>> arrays1 = ListUtil.buildList2(new Integer[][] {
            {1,2,3},
            {4,5},
            {1,2,3}
        });
        assertEquals(4, instance.maxDistance(arrays1));
    }

}
