package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution717;

public class Solution717Test {

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
        System.out.println("isOneBitCharacter");
        Solution717 instance = new Solution717();

        assertEquals(true, instance.isOneBitCharacter(new int[] {1, 0, 0}));
        assertEquals(false, instance.isOneBitCharacter(new int[] {1, 1, 1, 0}));
    }

}
