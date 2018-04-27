package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution691;

public class Solution691Test {

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
        System.out.println("minStickers");
        Solution691 instance = new Solution691();

        assertEquals(3, instance.minStickers(new String[] {"with", "example", "science"}, "thehat"));
        assertEquals(-1, instance.minStickers(new String[] {"notice", "possible"}, "basicbasic"));
    }

}
