package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution211;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution211Test {
    
    public Solution211Test() {
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
     * Test of addWord method, of class Solution211.
     */
    @Test
    public void testAddWord() {
        System.out.println("addWord");
        String word = "";
        Solution211 instance = new Solution211();
        instance.addWord(word);
    }

    /**
     * Test of search method, of class Solution211.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Solution211 instance = new Solution211();
        
        instance.addWord("bad");
        instance.addWord("dad");
        instance.addWord("mad");
        assertEquals(false, instance.search("pad"));
        assertEquals(true, instance.search("bad"));
        assertEquals(true, instance.search(".ad"));
        assertEquals(true, instance.search("b.."));
        assertEquals(false, instance.search(".bd"));
        assertEquals(false, instance.search("ba"));
        assertEquals(false, instance.search("m."));
        
        Solution211 instance2 = new Solution211();
        assertEquals(false, instance2.search("."));
        
        Solution211 instance3 = new Solution211();
        instance3.addWord("a");
        assertEquals(true, instance3.search("."));
        
        Solution211 instance4 = new Solution211();
        instance4.addWord("a");
        instance4.addWord("a");
        assertEquals(true, instance4.search("."));
        assertEquals(true, instance4.search("a"));
        assertEquals(false, instance4.search("aa"));
        assertEquals(true, instance4.search("a"));
        assertEquals(false, instance4.search(".a"));
        assertEquals(false, instance4.search("a."));
    }
}
