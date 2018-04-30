package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution301;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution301Test {
    
    public Solution301Test() {
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
     * Test of removeInvalidParentheses method, of class Solution301.
     */
    @Test
    public void testRemoveInvalidParentheses() {
        System.out.println("removeInvalidParentheses");
        Solution301 instance = new Solution301();

        List<String> expect1 = ListUtil.buildList(new String[] {""});
        List<String> result1 = instance.removeInvalidParentheses("");
        assertEquals(expect1, result1);
        
        List<String> result2 = instance.removeInvalidParentheses("()())()");
        List<String> expect2 = ListUtil.buildList(new String[] {"()()()","(())()"});
        assertTrue(ListUtil.equalsIgnoreOrder(result2, expect2));
        
        List<String> result3 = instance.removeInvalidParentheses("(a)())()");
        List<String> expect3 = ListUtil.buildList(new String[] {"(a)()()","(a())()"});
        assertTrue(ListUtil.equalsIgnoreOrder(result3, expect3));
        
        List<String> result4 = instance.removeInvalidParentheses(")(");
        assertEquals(1, result4.size());
        assertEquals("", result4.get(0));
    }
}
