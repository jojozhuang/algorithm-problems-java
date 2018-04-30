package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution348;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution348Test {
    
    public Solution348Test() {
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
     * Test of move method, of class Solution348.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Solution348 instance = new Solution348(3);
        
        assertEquals(0, instance.move(0, 0, 1));
        assertEquals(0, instance.move(0, 2, 2));
        assertEquals(0, instance.move(2, 2, 1));
        assertEquals(0, instance.move(1, 1, 2));
        assertEquals(0, instance.move(2, 0, 1));
        assertEquals(0, instance.move(1, 0, 2));
        assertEquals(1, instance.move(2, 1, 1));
    }
}
