package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution394;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution394Test {
    
    public Solution394Test() {
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
     * Test of decodeString method, of class Solution394.
     */
    @Test
    public void testDecodeString() {
        System.out.println("decodeString");
        String s = "";
        Solution394 instance = new Solution394();
        String expResult = "";
        String result = instance.decodeString(s);
        assertEquals(expResult, result);
        
        assertEquals("aaabcbc", instance.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", instance.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", instance.decodeString("2[abc]3[cd]ef"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}