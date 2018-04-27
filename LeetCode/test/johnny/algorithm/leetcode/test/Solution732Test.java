package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution732;

public class Solution732Test {

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
        System.out.println("MyCalendarThree");
        Solution732 instance = new Solution732();

        assertEquals(1, instance.book(10, 20));
        assertEquals(1, instance.book(50, 60));
        assertEquals(2, instance.book(10, 40));
        assertEquals(3, instance.book(5, 15));
        assertEquals(3, instance.book(5, 10));
        assertEquals(3, instance.book(25, 55));
    }

}
