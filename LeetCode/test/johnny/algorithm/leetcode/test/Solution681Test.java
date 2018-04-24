package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution681;

public class Solution681Test {

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
        System.out.println("nextClosestTime");
        
        Solution681 instance1 = new Solution681();
        assertEquals("19:39", instance1.nextClosestTime("19:34"));
        
        Solution681 instance2 = new Solution681();
        assertEquals("22:22", instance2.nextClosestTime("23:59"));
    }

}
