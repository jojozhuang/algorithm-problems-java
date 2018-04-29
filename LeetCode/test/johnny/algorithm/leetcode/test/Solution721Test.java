package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution721;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution721Test {

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
        System.out.println("accountsMerge");
        Solution721 instance = new Solution721();

        List<List<String>> accounts1 = ListUtil.buildList2(new String[][] {{"John", "johnsmith@mail.com", "john00@mail.com"}, {"John", "johnnybravo@mail.com"}, {"John", "johnsmith@mail.com", "john_newyork@mail.com"}, {"Mary", "mary@mail.com"}});
        List<List<String>> result1 = ListUtil.buildList2(new String[][]{{"John", "johnnybravo@mail.com"}, {"John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"}, {"Mary", "mary@mail.com"}});
        assertEquals(result1, instance.accountsMerge(accounts1));
    }

}
