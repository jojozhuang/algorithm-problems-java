package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution374;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution374Test {
    
    public Solution374Test() {
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
     * Test of guessNumber method, of class Solution374.
     */
    @Test
    public void testGuessNumber() {
        System.out.println("guessNumber");
        Solution374 instance = new Solution374(10, 6);

        assertEquals(6, instance.guessNumber(10));
    }
}
