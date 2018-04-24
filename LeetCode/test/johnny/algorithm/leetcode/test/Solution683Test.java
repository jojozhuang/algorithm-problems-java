package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution683;

public class Solution683Test {

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
        System.out.println("kEmptySlots");
        Solution683 instance = new Solution683();

        assertEquals(2, instance.kEmptySlots(new int[] {1,3,2}, 1));
        assertEquals(-1, instance.kEmptySlots(new int[] {1,2,3}, 1));
    }

}
