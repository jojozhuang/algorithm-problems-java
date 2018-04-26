package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution588;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution588Test {

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
        System.out.println("FileSystem");
        Solution588 instance = new Solution588();

        List<String> result1 = ListUtil.buildList(new String[] {});
        assertEquals(result1, instance.ls("/"));
        instance.mkdir("/a/b/c");
        instance.addContentToFile("/a/b/c/d","hello");
        assertEquals("hello", instance.readContentFromFile("/a/b/c/d"));
    }

}
