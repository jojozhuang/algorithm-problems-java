package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution406;

public class Solution406Test {

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
        System.out.println("reconstructQueue");
        Solution406 instance = new Solution406();

        int[][] people1 = new int[][] {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] expect1 = new int[][] {{5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}};
        assertArrayEquals(expect1, instance.reconstructQueue(people1));
    }

}
