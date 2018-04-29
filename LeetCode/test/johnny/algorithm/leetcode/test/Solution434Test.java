package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution434;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution434Test {
    
    public Solution434Test() {
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
     * Test of countSegments method, of class Solution434.
     */
    @Test
    public void testCountSegments() {
        System.out.println("countSegments");
        Solution434 instance = new Solution434();
        assertEquals(0, instance.countSegments(""));
        assertEquals(1, instance.countSegments("a"));
        assertEquals(2, instance.countSegments(" a b "));
        assertEquals(5, instance.countSegments("Hello, my name is John"));
        assertEquals(0, instance.countSegments("   "));
        assertEquals(6, instance.countSegments(", , , ,        a, eaefa"));
    }
}
