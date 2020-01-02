package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    
    public LongestSubstringWithoutRepeatingCharactersTest() {
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
     * Test of lengthOfLongestSubstring method, of class LongestSubstringWithoutRepeatingCharacters.
     */
    @Test
    public void testLengthOfLongestSubstring() {
        System.out.println("lengthOfLongestSubstring");
        String s = "";
        LongestSubstringWithoutRepeatingCharacters instance = new LongestSubstringWithoutRepeatingCharacters();
        int expResult = 0;
        int result = instance.lengthOfLongestSubstring(s);
        assertEquals(expResult, result);
        
        assertEquals(5, instance.lengthOfLongestSubstring("an++--viaj"));
    }
}
