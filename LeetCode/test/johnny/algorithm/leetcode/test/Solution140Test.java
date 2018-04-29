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
        String s = "";
        Set<String> dict = null;
        Solution140 instance = new Solution140();
        List<String> expResult = new LinkedList<String>();
        List<String> result = instance.wordBreak(s, dict);
        assertEquals(expResult, result);
        
        List<String> expResult2 = new LinkedList<>();
        expResult2.add("cats and dog");
        expResult2.add("cat sand dog");
        Set<String> dict2 = new HashSet<String>();
        dict2.add("cat");
        dict2.add("cats");
        dict2.add("and");
        dict2.add("sand");
        dict2.add("dog");
        List<String> result2 = instance.wordBreak("catsanddog", dict2);
        assertTrue(expResult2.containsAll(result2) && result2.containsAll(expResult2));
    }
}
