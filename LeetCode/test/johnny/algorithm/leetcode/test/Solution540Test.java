package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution540;

public class Solution540Test {

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
        System.out.println("singleNonDuplicate");
        Solution540 instance = new Solution540();

        assertEquals(2, instance.singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
        assertEquals(10, instance.singleNonDuplicate(new int[] {3,3,7,7,10,11,11}));
    }

}
