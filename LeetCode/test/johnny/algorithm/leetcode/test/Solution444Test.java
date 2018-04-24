package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution444;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution444Test {

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
        System.out.println("sequenceReconstruction");
        Solution444 instance = new Solution444();

        List<List<Integer>> seqs1 = ListUtil.buildList2(new Integer[][] {{1,2},{1,3}});
        assertEquals(false, instance.sequenceReconstruction(new int[] {1,2,3}, seqs1));

        List<List<Integer>> seqs2 = ListUtil.buildList2(new Integer[][] {{1,2}});
        assertEquals(false, instance.sequenceReconstruction(new int[] {1,2,3}, seqs2));

        List<List<Integer>> seqs3 = ListUtil.buildList2(new Integer[][] {{1,2},{1,3},{2,3}});
        assertEquals(true, instance.sequenceReconstruction(new int[] {1,2,3}, seqs3));

        List<List<Integer>> seqs4 = ListUtil.buildList2(new Integer[][] {{5,2,6,3},{4,1,5,2}});
        assertEquals(true, instance.sequenceReconstruction(new int[] {4,1,5,2,6,3}, seqs4));
    }
}
