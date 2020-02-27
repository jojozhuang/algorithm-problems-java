package johnny.lintcode.algorithm;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class LongestWordsTest extends JunitBase {
    /**
     * Test of longestWords method, of class LongestWords.
     */
    @Test
    public void testLongestWords() {
        System.out.println("longestWords");
        String[] dictionary = null;
        LongestWords instance = new LongestWords();
        ArrayList<String> expResult = new ArrayList<String>();
        ArrayList<String> result = instance.longestWords(dictionary);
        assertEquals(expResult, result);
        
        ArrayList<String> expResult2 = new ArrayList<String>();
        expResult2.add("apple");
        ArrayList<String> result2 = instance.longestWords(new String[]{"apple"});
        assertEquals(expResult2, result2);

        ArrayList<String> expResult3 = new ArrayList<String>();
        expResult3.add("banana");
        ArrayList<String> result3 = instance.longestWords(new String[]{"apple", "banana"});
        assertEquals(expResult3, result3);
        
         ArrayList<String> expResult4 = new ArrayList<String>();
        expResult4.add("banana");
        expResult4.add("orange");
        ArrayList<String> result4 = instance.longestWords(new String[]{"apple", "banana", "orange"});
        assertEquals(expResult4, result4);

        ArrayList<String> expResult5 = new ArrayList<String>();
        expResult5.add("internationalization");
        ArrayList<String> result5 = instance.longestWords(new String[]{"dog", "google", "facebook","internationalization","blabla"});
        assertEquals(expResult5, result5);

        ArrayList<String> expResult6 = new ArrayList<String>();
        expResult6.add("like");
        expResult6.add("love");
        expResult6.add("hate");
        ArrayList<String> result6 = instance.longestWords(new String[]{"like", "love", "hate","yes"});
        assertEquals(expResult6, result6);
    }
}
