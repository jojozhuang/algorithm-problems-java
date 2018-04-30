package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution242;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution242Test {
    
    public Solution242Test() {
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
     * Test of isAnagram1 method, of class Solution242.
     */
    @Test
    public void testIsAnagram() {
        System.out.println("isAnagram");
        Solution242 instance = new Solution242();

        assertEquals(true, instance.isAnagram("", ""));
        assertEquals(false, instance.isAnagram("bc", "ab"));
        assertEquals(true, instance.isAnagram("ba", "ab"));
        assertEquals(true, instance.isAnagram("anagram", "nagaram"));
        assertEquals(false, instance.isAnagram("car", "rat"));
    }
}
