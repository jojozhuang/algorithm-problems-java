package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution474;

public class Solution474Test {

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
        System.out.println("findMaxForm");
        Solution474 instance = new Solution474();

        assertEquals(4, instance.findMaxForm(new String[] {"10", "0001", "111001", "1", "0"},5,3));
        assertEquals(2, instance.findMaxForm(new String[] {"10", "0", "1"},1,1));
    }

}
