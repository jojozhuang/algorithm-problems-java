package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution126;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution126Test {
    
    public Solution126Test() {
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
     * Test of findLadders method, of class Solution126.
     */
    @Test
    public void testFindLadders() {
        System.out.println("findLadders");
        Solution126 instance = new Solution126();

        List<List<String>> expect1 = ListUtil.buildList2(new String[][] {});
        List<List<String>> result = instance.findLadders("", "", null);
        assertEquals(expect1, result);
        
        List<String> wordList2 = ListUtil.buildList(new String[] {"hot","dot","dog","lot","log"});
        List<List<String>> expect2 = ListUtil.buildList2(new String[][] {});
        assertEquals(expect2, instance.findLadders("hit", "cog", wordList2));
        
        List<String> wordList3 = ListUtil.buildList(new String[] {"hot","dot","dog","lot","log","cog"});
        List<List<String>> expect3 = ListUtil.buildList2(new String[][] {{"hit","hot","dot","dog","cog"},{"hit","hot","lot","log","cog"}});
        assertEquals(expect3, instance.findLadders("hit", "cog", wordList3));
    }
}
