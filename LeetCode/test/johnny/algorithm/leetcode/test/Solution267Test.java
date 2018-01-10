package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution267;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution267Test {
    
    public Solution267Test() {
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
     * Test of generatePalindromes method, of class Solution267.
     */
    @Test
    public void testGeneratePalindromes() {
        System.out.println("generatePalindromes");
        String s = "";
        Solution267 instance = new Solution267();
        List<String> expResult = new ArrayList<String>();
        List<String> result = instance.generatePalindromes(s);
        assertTrue(expResult.containsAll(result) && result.containsAll(expResult));
        
        List<String> expResult2 = new ArrayList<String>();
        expResult2.add("abba");
        expResult2.add("baab");
        List<String> result2 = instance.generatePalindromes("aabb");
        assertTrue(expResult2.containsAll(result2) && result2.containsAll(expResult2));
        
        List<String> expResult3 = new ArrayList<String>();
        List<String> result3 = instance.generatePalindromes("abc");
        assertTrue(expResult3.containsAll(result3) && result3.containsAll(expResult3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
