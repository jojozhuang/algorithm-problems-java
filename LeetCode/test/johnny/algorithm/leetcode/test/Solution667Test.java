package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution667;

public class Solution667Test {

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
        System.out.println("constructArray");
        Solution667 instance = new Solution667();

        assertArrayEquals(new int[] {1, 2, 3}, instance.constructArray(3,1));
        assertArrayEquals(new int[] {3, 1, 2}, instance.constructArray(3,2));
    }

}
