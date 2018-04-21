package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution682;

public class Solution682Test {

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
        System.out.println("calPoints");
        Solution682 instance = new Solution682();

        assertEquals(30, instance.calPoints(new String[] {"5","2","C","D","+"}));
        assertEquals(27, instance.calPoints(new String[] {"5","-2","4","C","D","9","+","+"}));
    }

}
