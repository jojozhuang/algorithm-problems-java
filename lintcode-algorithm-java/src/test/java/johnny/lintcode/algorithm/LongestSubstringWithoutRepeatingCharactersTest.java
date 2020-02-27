package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class LongestSubstringWithoutRepeatingCharactersTest extends JunitBase {

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
