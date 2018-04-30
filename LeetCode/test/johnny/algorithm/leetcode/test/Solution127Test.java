package johnny.algorithm.leetcode.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution127;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution127Test {
    
    public Solution127Test() {
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
     * Test of ladderLength method, of class Solution127.
     */
    @Test
    public void testLadderLength() {
        System.out.println("ladderLength");
        Solution127 instance = new Solution127();

        assertEquals(0, instance.ladderLength("", "", null));

        List<String> wordList2 = ListUtil.buildList(new String[]{"hot", "dot", "dog", "lot","log"});
        assertEquals(0, instance.ladderLength("hit", "pet", wordList2));
        
        List<String> wordList3 = ListUtil.buildList(new String[]{"hot", "dot", "dog", "lot","log"});
        assertEquals(2, instance.ladderLength("hit", "hot", wordList3));
        
        List<String> wordList4 = ListUtil.buildList(new String[]{"hot", "dot", "dog", "lot","log"});
        assertEquals(3, instance.ladderLength("hit", "dot", wordList4));
        
        List<String> wordList5 = ListUtil.buildList(new String[]{"hot", "dot", "dog", "lot","log"});
        assertEquals(4, instance.ladderLength("hit", "dog", wordList5));
        
        List<String> wordList6 = ListUtil.buildList(new String[]{"hot", "dot", "dog", "lot","log"});
        assertEquals(5, instance.ladderLength("hit", "cog", wordList6));
    }
}
