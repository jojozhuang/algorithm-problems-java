package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution468;

public class Solution468Test {

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
        System.out.println("validIPAddress");
        Solution468 instance = new Solution468();

        assertEquals("IPv4", instance.validIPAddress("172.16.254.1"));
        assertEquals("IPv6", instance.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("Neither", instance.validIPAddress("256.256.256.256"));
    }

}
