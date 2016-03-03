/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

import java.util.ArrayList;
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
public class LongestWordsTest {
    
    public LongestWordsTest() {
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
