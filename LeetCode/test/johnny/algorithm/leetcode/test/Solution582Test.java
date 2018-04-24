package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution582;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution582Test {

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
        System.out.println("killProcess");
        Solution582 instance = new Solution582();

        List<Integer> pid1 = ListUtil.buildList(new Integer[] {1, 3, 10, 5});
        List<Integer> ppid1 = ListUtil.buildList(new Integer[] {3, 0, 5, 3});
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {5,10});
        assertEquals(expect1, instance.killProcess(pid1, ppid1, 5));
    }

}
