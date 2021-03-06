package johnny.hackerrank.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.hackerrank.algorithm.Anagram;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class AnagramTest {
    
    public AnagramTest() {
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
     * Test of makeAnagram method, of class Anagram.
     */
    @Test
    public void testMakeAnagram() {
        System.out.println("makeAnagram");
        String s = "";
        Anagram instance = new Anagram();
        int expResult = 0;
        int result = instance.makeAnagram(s);
        assertEquals(expResult, result);
        
        assertEquals(3, instance.makeAnagram("aaabbb"));
        assertEquals(1, instance.makeAnagram("ab"));
        assertEquals(-1, instance.makeAnagram("abc"));
        assertEquals(2, instance.makeAnagram("mnop"));
        assertEquals(0, instance.makeAnagram("xyyx"));
        assertEquals(1, instance.makeAnagram("xaxbbbxx"));
    }
}
