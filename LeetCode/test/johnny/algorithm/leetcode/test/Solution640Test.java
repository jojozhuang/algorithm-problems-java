package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution640;

public class Solution640Test {

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
        System.out.println("solveEquation");
        Solution640 instance = new Solution640();

        assertEquals("x=2", instance.solveEquation("x+5-3+x=6+x-2"));
        assertEquals("Infinite solutions", instance.solveEquation("x=x"));
        assertEquals("x=0", instance.solveEquation("2x=x"));
        assertEquals("x=-1", instance.solveEquation("2x+3x-6x=x+2"));
        assertEquals("No solution", instance.solveEquation("x=x+2"));
    }
}
