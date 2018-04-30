package johnny.algorithm.leetcode.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution030;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution030Test {
    
    public Solution030Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findSubstring method, of class Solution030.
     */
    @Test
    public void testFindSubstring() {
        System.out.println("findSubstring");
        Solution030 instance = new Solution030();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect1, instance.findSubstring("", null));

        List<Integer> expect2 = ListUtil.buildList(new Integer[] {0,9});
        assertEquals(expect2, instance.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
    }
}
