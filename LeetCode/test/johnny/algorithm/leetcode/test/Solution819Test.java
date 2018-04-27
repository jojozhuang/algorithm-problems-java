package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution819;

public class Solution819Test {

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
        System.out.println("mostCommonWord");
        
        String paragraph1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned1 = {"hit"};
        Solution819 instance = new Solution819();
        assertEquals("ball", instance.mostCommonWord(paragraph1, banned1));
    }

}
