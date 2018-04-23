package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution457;

public class Solution457Test {

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
        System.out.println("circularArrayLoop");
        Solution457 instance = new Solution457();

        assertEquals(true, instance.circularArrayLoop(new int[] {2, -1, 1, 2, 2}));
        assertEquals(false, instance.circularArrayLoop(new int[] {-1,2}));
    }

}
