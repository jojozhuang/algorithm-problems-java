package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution438;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution438Test {
    
    public Solution438Test() {
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
     * Test of findAnagrams method, of class Solution438.
     */
    @Test
    public void testFindAnagrams() {
        System.out.println("findAnagrams");
        Solution438 instance = new Solution438();
        
        List<Integer> expect1 = new ArrayList<Integer>();
        assertEquals(expect1, instance.findAnagrams("", "a"));
        assertEquals(expect1, instance.findAnagrams("a", "abc"));
        
        List<Integer> expect2 = ListUtil.buildList(new Integer[] {0});
        assertEquals(expect2, instance.findAnagrams("a", "a"));
        
        List<Integer> expect3 = ListUtil.buildList(new Integer[] {0,1,2});
        assertEquals(expect3, instance.findAnagrams("abab", "ab"));
        
        List<Integer> expect4 = ListUtil.buildList(new Integer[] {0,6});
        assertEquals(expect4, instance.findAnagrams("cbaebabacd", "abc"));
        
        List<Integer> expect5 = ListUtil.buildList(new Integer[] {3});
        assertEquals(expect5, instance.findAnagrams("abcde", "de"));
    }
}
