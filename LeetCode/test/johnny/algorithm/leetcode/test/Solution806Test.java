package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution806;

public class Solution806Test {

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
        System.out.println("numberOfLines");
        Solution806 instance = new Solution806();

        int[] widths1 = new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int[] result1 = new int[] {3,60};
        assertArrayEquals(result1, instance.numberOfLines(widths1, "abcdefghijklmnopqrstuvwxyz"));

        int[] widths2 = new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int[] result2 = new int[] {2,4};
        assertArrayEquals(result2, instance.numberOfLines(widths2, "bbbcccdddaaa"));
}

}
