package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution165;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution165Test {
    
    public Solution165Test() {
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
     * Test of compareVersion method, of class Solution165.
     */
    @Test
    public void testCompareVersion() {
        System.out.println("compareVersion");
        Solution165 instance = new Solution165();
        
        assertEquals(0, instance.compareVersion("1.0", "1"));
        assertEquals(0, instance.compareVersion("1", "01"));
        assertEquals(0, instance.compareVersion("1.1", "1.1.0.00."));
        assertEquals(-1, instance.compareVersion("0.1", "0.11"));
        assertEquals(-1, instance.compareVersion("0.2", "0.15"));
        assertEquals(0, instance.compareVersion("1.2", "1.2"));
        assertEquals(1, instance.compareVersion("1.1", "1.0.1"));
        assertEquals(-1, instance.compareVersion("1.0", "1.0.1"));
        assertEquals(1, instance.compareVersion("2.333333", "2.333332"));
    }
}
