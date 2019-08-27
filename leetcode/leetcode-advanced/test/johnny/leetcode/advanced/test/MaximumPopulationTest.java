package johnny.leetcode.advanced.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.leetcode.advanced.MaximumPopulation;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class MaximumPopulationTest {
    
    public MaximumPopulationTest() {
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
     * Test of longestPalindrome method, of class LongestPalindrome.
     */
    @Test
    public void testMostPopulationYear() {
        System.out.println("getMostPopulationYear");
        MaximumPopulation instance = new MaximumPopulation();

        int[][] people1 = new int[][] {{1970, 2001}};
        assertEquals(1, instance.getMostPopulationYear(people1));
        
        int[][] people2 = new int[][] {{1970, 2001},{1980, 1998}, {2000, 2018},{1956, 2017}};
        assertEquals(3, instance.getMostPopulationYear(people2));
        
        int[][] people3 = new int[][] {{1970, 2001},{1980, 2002}, {2000, 2018},{1956, 2017}};
        assertEquals(4, instance.getMostPopulationYear(people3));
    }
}
