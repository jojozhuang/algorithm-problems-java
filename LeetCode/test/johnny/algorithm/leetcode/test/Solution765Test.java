package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution765;

public class Solution765Test {

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
        System.out.println("minSwapsCouples");
        Solution765 instance = new Solution765();

        assertEquals(1, instance.minSwapsCouples(new int[] {0, 2, 1, 3}));
        assertEquals(0, instance.minSwapsCouples(new int[] {3, 2, 0, 1}));
    }

}
