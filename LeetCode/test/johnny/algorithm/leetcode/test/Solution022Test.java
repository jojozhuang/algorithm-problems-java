package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution022;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution022Test {
    
    public Solution022Test() {
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
     * Test of generateParenthesis method, of class Solution022.
     */
    @Test
    public void testGenerateParenthesis() {
        System.out.println("generateParenthesis");
        Solution022 instance = new Solution022();

        List<String> expect1 = new ArrayList<String>();
        assertEquals(expect1, instance.generateParenthesis(0));

        List<String> expect2 = ListUtil.buildList(new String[] {"()"});
        assertEquals(expect2, instance.generateParenthesis(1));

        List<String> expect3 = ListUtil.buildList(new String[] {"()()","(())"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, instance.generateParenthesis(2)));

        List<String> expect4 = ListUtil.buildList(new String[] {"((()))","(()())","(())()","()(())","()()()"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, instance.generateParenthesis(3)));
    }
}
