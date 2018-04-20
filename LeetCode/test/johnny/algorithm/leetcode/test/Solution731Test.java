package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution731;

public class Solution731Test {

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
        System.out.println("MyCalendarTwo");
        Solution731 instance = new Solution731();

        assertEquals(true, instance.book(10, 20));
        assertEquals(true, instance.book(50, 60));
        assertEquals(true, instance.book(10, 40));
        assertEquals(false, instance.book(5, 15));
        assertEquals(true, instance.book(5, 10));
        assertEquals(true, instance.book(25, 55));
    }

}
