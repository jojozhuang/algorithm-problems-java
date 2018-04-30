package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution386;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution386Test {

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
        System.out.println("lexicalOrder");
        Solution386 instance = new Solution386();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1,10,11,12,13,2,3,4,5,6,7,8,9});
        assertEquals(expect1, instance.lexicalOrder(13));
    }
}
