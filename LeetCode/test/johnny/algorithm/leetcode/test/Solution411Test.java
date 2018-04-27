package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution411;

public class Solution411Test {

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
        System.out.println("minAbbreviation");
        Solution411 instance = new Solution411();

        String[] dictionary1 = new String[] {"word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"};
        assertEquals("5", instance.minAbbreviation("a32bc", dictionary1));
        
        String[] dictionary2 = new String[] {"blade"};
        assertEquals("a4", instance.minAbbreviation("apple", dictionary2));

        String[] dictionary3 = new String[] {"plain", "amber", "blade"};
        assertEquals("1p3", instance.minAbbreviation("apple", dictionary3));
    }

}
