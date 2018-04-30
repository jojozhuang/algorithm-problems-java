package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution420;

public class Solution420Test {

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
        System.out.println("strongPasswordChecker");
        Solution420 instance = new Solution420();

        assertEquals(5, instance.strongPasswordChecker("a"));
        assertEquals(2, instance.strongPasswordChecker("abbb"));
        assertEquals(0, instance.strongPasswordChecker("aFan%128"));
    }
}
