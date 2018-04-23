package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution336;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution336Test {
    
    public Solution336Test() {
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
     * Test of palindromePairs method, of class Solution336.
     */
    @Test
    public void testPalindromePairs() {
        System.out.println("palindromePairs");
        String[] words = null;
        Solution336 instance = new Solution336();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.palindromePairs(words);
        assertEquals(expResult, result);
        
        List<List<Integer>> result2 = instance.palindromePairs(new String[]{"bat", "tab", "cat"});
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{0,1},{1,0}});
        assertTrue(ListUtil.equalsIgnoreOrder(result2, expect2));
        
        List<List<Integer>> result3 = instance.palindromePairs(new String[]{"abcd", "dcba", "lls", "s", "sssll"});
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{0,1},{1,0},{3,2},{2,4}});
        assertTrue(ListUtil.equalsIgnoreOrder(result3, expect3));
    }
    
}
