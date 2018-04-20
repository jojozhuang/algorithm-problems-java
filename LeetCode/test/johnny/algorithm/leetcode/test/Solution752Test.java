package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution752;

public class Solution752Test {

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
        System.out.println("maxIncreaseKeepingSkyline");
        Solution752 instance = new Solution752();

        assertEquals(6, instance.openLock(new String[]{"0201","0101","0102","1212","2002"}, "0202"));
        assertEquals(1, instance.openLock(new String[]{"8888"}, "0009"));
        assertEquals(-1, instance.openLock(new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"}, "8888"));
        assertEquals(-1, instance.openLock(new String[]{"0000"}, "8888"));
    }

}
