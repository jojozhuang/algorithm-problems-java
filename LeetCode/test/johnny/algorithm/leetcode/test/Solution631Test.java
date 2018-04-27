package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution631;

public class Solution631Test {

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
        System.out.println("Excel");
        Solution631 instance = new Solution631(3,'C');

        instance.set(1, 'A', 2);
        assertEquals(2, instance.get(1,'A'));
        assertEquals(4, instance.sum(3, 'C', new String[] {"A1", "A1:B2"}));
        instance.set(2, 'B', 2);
        assertEquals(6, instance.sum(3, 'C', new String[] {"A1", "A1:B2"}));
    }

}
