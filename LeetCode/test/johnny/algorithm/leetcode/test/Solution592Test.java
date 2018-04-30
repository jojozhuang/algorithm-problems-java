package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution592;

public class Solution592Test {

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
        System.out.println("fractionAddition");
        Solution592 instance = new Solution592();

        assertEquals("0/1", instance.fractionAddition("-1/2+1/2"));
        assertEquals("1/3", instance.fractionAddition("-1/2+1/2+1/3"));
        assertEquals("-1/6", instance.fractionAddition("1/3-1/2"));
        assertEquals("2/1", instance.fractionAddition("5/3+1/3"));
    }
}
