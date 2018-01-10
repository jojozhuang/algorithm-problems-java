package johnny.algorithm.leetcode.test;

import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution139;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution139Test {
    
    public Solution139Test() {
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
     * Test of wordBreak method, of class Solution139.
     */
    @Test
    public void testWordBreak() {
        System.out.println("wordBreak");
        String s = "";
        Set<String> dict = null;
        Solution139 instance = new Solution139();
        boolean expResult = false;
        boolean result = instance.wordBreak(s, dict);
        assertEquals(expResult, result);
        
        Set<String> dict2 = new HashSet<String>();
        dict2.add("a");        
        assertEquals(true, instance.wordBreak("a", dict2));
        Set<String> dict3 = new HashSet<String>();
        dict3.add("b");        
        assertEquals(false, instance.wordBreak("a", dict3));
        Set<String> dict4 = new HashSet<String>();
        dict4.add("cd");     
        dict4.add("ap");   
        assertEquals(false, instance.wordBreak("abcd", dict4));
        Set<String> dict5 = new HashSet<String>();
        dict5.add("cd");     
        dict5.add("ap");   
        assertEquals(true, instance.wordBreak("cdap", dict5));
        Set<String> dict6 = new HashSet<String>();
        dict6.add("leet");     
        dict6.add("code");   
        assertEquals(true, instance.wordBreak("leetcode", dict6));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
