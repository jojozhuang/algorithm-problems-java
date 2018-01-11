package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution693;

public class Solution693Test {

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
        System.out.println("hasAlternatingBits");
        Solution693 instance = new Solution693();

        assertEquals(true, instance.hasAlternatingBits(1));
        assertEquals(true, instance.hasAlternatingBits(2));
        assertEquals(false, instance.hasAlternatingBits(3));
        assertEquals(true, instance.hasAlternatingBits(5));
        assertEquals(false, instance.hasAlternatingBits(7));
        assertEquals(true, instance.hasAlternatingBits(10));

    }

}
