package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution738;

public class Solution738Test {

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
        System.out.println("monotoneIncreasingDigits");
        Solution738 instance = new Solution738();

        assertEquals(9, instance.monotoneIncreasingDigits(10));
        assertEquals(1234, instance.monotoneIncreasingDigits(1234));
        assertEquals(299, instance.monotoneIncreasingDigits(332));
    }

}
