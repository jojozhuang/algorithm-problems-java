package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution245;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution245Test {
    
    public Solution245Test() {
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
     * Test of shortestDistance method, of class Solution245.
     */
    @Test
    public void testShortestDistance() {
        System.out.println("shortestDistance");
        String[] words = new String[]{};
        String word1 = "";
        String word2 = "";
        Solution245 instance = new Solution245();
        int expResult = Integer.MAX_VALUE;
        int result = instance.shortestWordDistance(words, word1, word2);
        assertEquals(expResult, result);
        
        String[] words2 = new String[]{"practice", "makes", "perfect", "coding", "makes"};
        assertEquals(3, instance.shortestWordDistance(words2, "coding", "practice"));
        assertEquals(1, instance.shortestWordDistance(words2, "makes", "coding"));
        assertEquals(3, instance.shortestWordDistance(words2, "makes", "makes"));
        
        String[] words3 = new String[]{"practice", "makes", "perfect", "coding", "makes","makes"};
        assertEquals(3, instance.shortestWordDistance(words3, "coding", "practice"));
        assertEquals(1, instance.shortestWordDistance(words3, "makes", "coding"));
        assertEquals(1, instance.shortestWordDistance(words3, "makes", "makes"));
    }
}
