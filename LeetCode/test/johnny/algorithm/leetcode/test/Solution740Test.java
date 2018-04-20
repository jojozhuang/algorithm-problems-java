package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution740;

public class Solution740Test {

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
        System.out.println("deleteAndEarn");
        Solution740 instance = new Solution740();

        assertEquals(6, instance.deleteAndEarn(new int[] {3, 4, 2}));
        assertEquals(9, instance.deleteAndEarn(new int[] {2, 2, 3, 3, 3, 4}));
    }

}
