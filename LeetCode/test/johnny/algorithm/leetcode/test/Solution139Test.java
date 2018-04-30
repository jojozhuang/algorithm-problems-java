package johnny.algorithm.leetcode.test;

import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution139;
import johnny.algorithm.leetcode.common.SetUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution139Test {
    
    public Solution139Test() {
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
     * Test of wordBreak method, of class Solution139.
     */
    @Test
    public void testWordBreak() {
        System.out.println("wordBreak");
        Solution139 instance = new Solution139();

        assertEquals(false, instance.wordBreak("", null));
        
        Set<String> dict2 = SetUtil.buildList(new String[] {"a"});
        assertEquals(true, instance.wordBreak("a", dict2));
        
        Set<String> dict3 = SetUtil.buildList(new String[] {"b"});
        assertEquals(false, instance.wordBreak("a", dict3));
        
        Set<String> dict4 = SetUtil.buildList(new String[] {"cd","ap"});
        assertEquals(false, instance.wordBreak("abcd", dict4));
        
        Set<String> dict5 = SetUtil.buildList(new String[] {"cd","ap"});
        assertEquals(true, instance.wordBreak("cdap", dict5));
        
        Set<String> dict6 = SetUtil.buildList(new String[] {"leet","code"});
        assertEquals(true, instance.wordBreak("leetcode", dict6));
    }
}
