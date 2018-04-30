package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution393;

public class Solution393Test {

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
        System.out.println("validUtf8");
        Solution393 instance = new Solution393();

        assertEquals(true, instance.validUtf8(new int[] {197, 130, 1}));
        assertEquals(false, instance.validUtf8(new int[] {235, 140, 4}));
    }
}
