package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution433;

public class Solution433Test {

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
        System.out.println("minMutation");
        Solution433 instance = new Solution433();

        assertEquals(1, instance.minMutation("AACCGGTT","AACCGGTA", new String[] {"AACCGGTA"}));
        assertEquals(2, instance.minMutation("AACCGGTT","AAACGGTA", new String[] {"AACCGGTA", "AACCGCTA", "AAACGGTA"}));
        assertEquals(3, instance.minMutation("AAAAACCC","AACCCCCC", new String[] {"AAAACCCC", "AAACCCCC", "AACCCCCC"}));
    }
}
