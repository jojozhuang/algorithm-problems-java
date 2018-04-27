package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution775;

public class Solution775Test {

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
        System.out.println("isIdealPermutation");
        Solution775 instance = new Solution775();

        assertEquals(true, instance.isIdealPermutation(new int[] {1,0,2}));
        assertEquals(false, instance.isIdealPermutation(new int[] {1,2,0}));
    }

}
