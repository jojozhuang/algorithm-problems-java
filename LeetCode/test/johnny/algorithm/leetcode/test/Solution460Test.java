package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution460;

public class Solution460Test {

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
        System.out.println("LFUCache");
        Solution460 cache = new Solution460(2);

        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        assertEquals(-1, cache.get(2));       // returns -1 (not found)
        assertEquals(3, cache.get(3));       // returns 3.
        cache.put(4, 4);    // evicts key 1.
        assertEquals(-1,cache.get(1));       // returns -1 (not found)
        assertEquals(3,cache.get(3));       // returns 3
        assertEquals(4,cache.get(4));       // returns 4
    }
}
