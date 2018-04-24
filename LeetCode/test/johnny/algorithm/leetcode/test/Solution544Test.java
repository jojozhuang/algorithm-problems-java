package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution544;

public class Solution544Test {

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
        System.out.println("findContestMatch");
        Solution544 instance = new Solution544();

        assertEquals("(1,2)", instance.findContestMatch(2));
        assertEquals("((1,4),(2,3))", instance.findContestMatch(4));
        assertEquals("(((1,8),(4,5)),((2,7),(3,6)))", instance.findContestMatch(8));
    }

}
