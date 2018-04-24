package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution635;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution635Test {

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
        System.out.println("LogSystem");
        Solution635 instance = new Solution635();

        instance.put(1, "2017:01:01:23:59:59");
        instance.put(2, "2017:01:01:22:59:59");
        instance.put(3, "2016:01:01:00:00:00");

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1,2,3});
        assertEquals(expect1, instance.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Year"));
     
        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1,2});
        assertEquals(expect2, instance.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Hour"));
    }
}
