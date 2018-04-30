package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution277;

public class Solution277Test {

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
        System.out.println("findCelebrity");
        Solution277 instance = new Solution277();

        assertEquals(0, instance.findCelebrity(0));
        assertEquals(0, instance.findCelebrity(1));
        assertEquals(-1, instance.findCelebrity(2));
        assertEquals(-1, instance.findCelebrity(3));
        assertEquals(-1, instance.findCelebrity(4));
        assertEquals(-1, instance.findCelebrity(5));
        assertEquals(-1, instance.findCelebrity(6));
        assertEquals(-1, instance.findCelebrity(7));
        assertEquals(-1, instance.findCelebrity(8));
        assertEquals(-1, instance.findCelebrity(9));
        assertEquals(-1, instance.findCelebrity(10));
        assertEquals(-1, instance.findCelebrity(20));
        assertEquals(-1, instance.findCelebrity(100));
    }
}
