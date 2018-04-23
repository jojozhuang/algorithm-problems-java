package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution451;

public class Solution451Test {

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
        System.out.println("frequencySort");
        Solution451 instance = new Solution451();

        assertEquals("eert", instance.frequencySort("tree"));
        assertEquals("aaaccc", instance.frequencySort("cccaaa"));
        assertEquals("bbAa", instance.frequencySort("Aabb"));
    }

}
