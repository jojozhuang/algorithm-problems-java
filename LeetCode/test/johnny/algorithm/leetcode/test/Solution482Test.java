package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution482;

public class Solution482Test {

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
        System.out.println("licenseKeyFormatting");
        Solution482 instance = new Solution482();

        assertEquals("5F3Z-2E9W", instance.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        assertEquals("2-5G-3J", instance.licenseKeyFormatting("2-5g-3-J", 2));
    }

}
