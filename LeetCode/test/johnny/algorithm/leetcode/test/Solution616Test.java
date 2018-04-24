package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution616;

public class Solution616Test {

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
        Solution616 instance = new Solution616();

        assertEquals("<b>abc</b>xyz<b>123</b>", instance.addBoldTag("abcxyz123", new String[] {"abc","123"}));
        assertEquals("<b>abc</b>xyz<b>123</b>", instance.addBoldTag("abcxyz123", new String[] {"abc","123"}));

    }

}
