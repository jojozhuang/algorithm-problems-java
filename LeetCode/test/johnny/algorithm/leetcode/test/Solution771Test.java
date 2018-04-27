package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution771;

public class Solution771Test {

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
        System.out.println("numJewelsInStones");
        Solution771 instance = new Solution771();

        assertEquals(3, instance.numJewelsInStones("aA","aAAbbbb"));
        assertEquals(0, instance.numJewelsInStones("z","ZZ"));
    }

}
