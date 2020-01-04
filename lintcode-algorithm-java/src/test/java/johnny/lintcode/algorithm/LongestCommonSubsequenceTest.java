package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class LongestCommonSubsequenceTest {
    
    public LongestCommonSubsequenceTest() {
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
     * Test of longestCommonSubsequence method, of class LongestCommonSubsequence.
     */
    @Test
    public void testLongestCommonSubsequence() {
        System.out.println("longestCommonSubsequence");
        String A = "";
        String B = "";
        LongestCommonSubsequence instance = new LongestCommonSubsequence();
        int expResult = 0;
        int result = instance.longestCommonSubsequence(A, B);
        assertEquals(expResult, result);
        
        assertEquals(0, instance.longestCommonSubsequence("a", "b"));
        assertEquals(1, instance.longestCommonSubsequence("a", "a"));
        assertEquals(1, instance.longestCommonSubsequence("a", "ab"));
        assertEquals(2, instance.longestCommonSubsequence("cd", "cd"));
        assertEquals(1, instance.longestCommonSubsequence("a", "aaabbbbb"));
        assertEquals(2, instance.longestCommonSubsequence("ab", "aabb"));
        assertEquals(1, instance.longestCommonSubsequence("edca", "abcd"));
        assertEquals(2, instance.longestCommonSubsequence("eacb", "abcd"));
    }
}
