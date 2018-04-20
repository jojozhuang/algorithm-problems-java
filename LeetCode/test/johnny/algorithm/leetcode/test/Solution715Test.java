package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution715;

public class Solution715Test {

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
        System.out.println("maxIncreaseKeepingSkyline");
        Solution715 instance = new Solution715();

        instance.addRange(10, 20);
        instance.removeRange(14, 16);
        assertEquals(true, instance.queryRange(10, 14));
        assertEquals(false, instance.queryRange(13, 15));
        assertEquals(true, instance.queryRange(16, 17));
    }

}
