package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution131;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution131Test {
    
    public Solution131Test() {
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
     * Test of partition method, of class Solution131.
     */
    @Test
    public void testPartition() {
        System.out.println("partition");
        Solution131 instance = new Solution131();
        
        List<List<String>> expect1 = ListUtil.buildList2(new String[][] {});
        assertEquals(expect1, instance.partition(""));
        
        List<List<String>> expect2 = ListUtil.buildList2(new String[][] {{"a"}});
        assertEquals(expect2, instance.partition("a"));
        
        List<List<String>> expect3 = ListUtil.buildList2(new String[][] {{"a","b"}});
        assertEquals(expect3, instance.partition("ab"));

        List<List<String>> expect4 = ListUtil.buildList2(new String[][] {{"a","a","b"},{"aa","b"}});
        assertEquals(expect4, instance.partition("aab"));
    }
}
