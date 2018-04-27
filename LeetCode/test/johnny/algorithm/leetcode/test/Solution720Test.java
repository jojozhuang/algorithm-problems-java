package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution720;

public class Solution720Test {

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
        System.out.println("longestWord");
        Solution720 instance = new Solution720();

        assertEquals("world", instance.longestWord(new String[] {"w","wo","wor","worl", "world"}));
        assertEquals("apple", instance.longestWord(new String[] {"a", "banana", "app", "appl", "ap", "apply", "apple"}));
    }

}
