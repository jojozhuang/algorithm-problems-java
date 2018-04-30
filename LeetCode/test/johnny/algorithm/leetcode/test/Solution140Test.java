package johnny.algorithm.leetcode.test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution140;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.SetUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution140Test {
    
    public Solution140Test() {
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
     * Test of wordBreak method, of class Solution140.
     */
    @Test
    public void testWordBreak() {
        System.out.println("wordBreak");
        Solution140 instance = new Solution140();

        List<String> expect1 = new LinkedList<String>();
        assertEquals(expect1, instance.wordBreak("", null));
        
        List<String> expect2 = ListUtil.buildList(new String[] {"cats and dog","cat sand dog"});
        Set<String> dict2 = SetUtil.buildList(new String[] {"cat","cats","and","sand","dog"});
        List<String> result2 = instance.wordBreak("catsanddog", dict2);
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));
    }
}
