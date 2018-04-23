package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution413;

public class Solution413Test {

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
        System.out.println("numberOfArithmeticSlices");
        Solution413 instance = new Solution413();

        assertEquals(6, instance.numberOfArithmeticSlices(new int[] {1, 3, 5, 7, 9}));
        assertEquals(3, instance.numberOfArithmeticSlices(new int[] {1, 2, 3, 4}));
    }

}
