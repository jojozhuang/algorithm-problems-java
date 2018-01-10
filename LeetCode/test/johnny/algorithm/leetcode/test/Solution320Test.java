package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution320;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution320Test {
    
    public Solution320Test() {
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
     * Test of generateAbbreviations method, of class Solution320.
     */
    @Test
    public void testGenerateAbbreviations() {
        System.out.println("generateAbbreviations");
        String word = "";
        Solution320 instance = new Solution320();
        List<String> expResult = new ArrayList<String>();
        List<String> result = instance.generateAbbreviations(word);
        assertEquals(expResult, result);
        
        String[] array2 = new String[]{"word","1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"};
        ArrayList<String> expResult2 = new ArrayList<String>(Arrays.asList(array2));
        List<String> result2 = instance.generateAbbreviations("word");
        assertTrue(result2.containsAll(expResult2)&&expResult2.containsAll(result2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
    
}
