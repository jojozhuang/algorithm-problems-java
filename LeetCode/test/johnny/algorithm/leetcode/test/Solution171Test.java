package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution171;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution171Test {
    
    public Solution171Test() {
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
     * Test of titleToNumber method, of class Solution171.
     */
    @Test
    public void testTitleToNumber() {
        System.out.println("titleToNumber");
        Solution171 instance = new Solution171();

        assertEquals(0, instance.titleToNumber(""));
        assertEquals(1, instance.titleToNumber("A"));
        assertEquals(25, instance.titleToNumber("Y"));
        assertEquals(26, instance.titleToNumber("Z"));
        assertEquals(27, instance.titleToNumber("AA"));
        assertEquals(52, instance.titleToNumber("AZ"));
        assertEquals(707, instance.titleToNumber("AAE"));
    }
}
