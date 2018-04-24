package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution439;

public class Solution439Test {

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
        System.out.println("parseTernary");
        Solution439 instance = new Solution439();

        assertEquals("2", instance.parseTernary("T?2:3"));
        assertEquals("4", instance.parseTernary("F?1:T?4:5"));
        assertEquals("F", instance.parseTernary("T?T?F:5:3"));
    }

}
