package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution162;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution162Test {
    
    public Solution162Test() {
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
     * Test of findPeakElement method, of class Solution162.
     */
    @Test
    public void testFindPeakElement() {
        System.out.println("findPeakElement");
        Solution162 instance = new Solution162();

        assertEquals(-1, instance.findPeakElement(null));
        
        assertEquals(1, instance.findPeakElement(new int[] {1, 2}));
        assertEquals(0, instance.findPeakElement(new int[] {1, 0}));
        assertEquals(2, instance.findPeakElement(new int[] {1, 2, 3, 1}));
        assertEquals(3, instance.findPeakElement(new int[] {1, 2, 3, 4}));
    }
}
