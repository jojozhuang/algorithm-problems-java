package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution518;

public class Solution518Test {

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
        System.out.println("change");
        Solution518 instance = new Solution518();

        assertEquals(4, instance.change(5, new int[] {1, 2, 5}));
        assertEquals(0, instance.change(3, new int[] {2}));
        assertEquals(1, instance.change(10, new int[] {10}));
    }

}
