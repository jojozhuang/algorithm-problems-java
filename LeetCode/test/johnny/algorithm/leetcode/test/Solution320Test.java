package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution320;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution320Test {
    
    public Solution320Test() {
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
     * Test of generateAbbreviations method, of class Solution320.
     */
    @Test
    public void testGenerateAbbreviations() {
        System.out.println("generateAbbreviations");
        Solution320 instance = new Solution320();

        List<String> expect1 = ListUtil.buildList(new String[]{""});
        List<String> result1 = instance.generateAbbreviations("");
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, result1));
        
        List<String> expect2 = ListUtil.buildList(new String[]{"word","1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"});
        List<String> result2 = instance.generateAbbreviations("word");
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));
    }    
    
}
