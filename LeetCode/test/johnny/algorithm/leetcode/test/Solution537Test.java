package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution537;

public class Solution537Test {

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
        System.out.println("complexNumberMultiply");
        Solution537 instance = new Solution537();

        assertEquals("0+2i", instance.complexNumberMultiply("1+1i", "1+1i"));
        assertEquals("0+-2i", instance.complexNumberMultiply("1+-1i", "1+-1i"));
    }

}
