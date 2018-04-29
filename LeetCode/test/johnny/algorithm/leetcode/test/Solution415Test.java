package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution415;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution415Test {
    
    public Solution415Test() {
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
     * Test of addStrings method, of class Solution415.
     */
    @Test
    public void testAddStrings() {
        System.out.println("addStrings");
        Solution415 instance = new Solution415();
        assertEquals("", instance.addStrings("", ""));
        assertEquals("1", instance.addStrings("", "1"));
        assertEquals("2", instance.addStrings("2", ""));
        assertEquals("3", instance.addStrings("1", "2"));
        assertEquals("4567", instance.addStrings("123", "4444"));
        assertEquals("322", instance.addStrings("321", "1"));
        assertEquals("20", instance.addStrings("19", "1"));
        assertEquals("100000000", instance.addStrings("99999000", "1000"));
    }
}
