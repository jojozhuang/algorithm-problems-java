package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution604;

public class Solution604Test {

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
        System.out.println("StringIterator");
        Solution604 instance = new Solution604("L1e2t1C1o1d1e1");

        assertEquals('L', instance.next());
        assertEquals('e', instance.next());
        assertEquals('e', instance.next());
        assertEquals('t', instance.next());
        assertEquals('C', instance.next());
        assertEquals('o', instance.next());
        assertEquals('d', instance.next());
        assertEquals(true, instance.hasNext());
        assertEquals('e', instance.next());
        assertEquals(false, instance.hasNext());
        assertEquals(' ', instance.next());
    }
}
