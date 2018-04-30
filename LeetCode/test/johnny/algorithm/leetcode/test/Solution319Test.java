package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution319;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution319Test {
    
    public Solution319Test() {
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
     * Test of bulbSwitch method, of class Solution319.
     */
    @Test
    public void testBulbSwitch() {
        System.out.println("bulbSwitch");
        Solution319 instance = new Solution319();

        assertEquals(0, instance.bulbSwitch(0));
        assertEquals(1, instance.bulbSwitch(1));
        assertEquals(1, instance.bulbSwitch(2));
        assertEquals(1, instance.bulbSwitch(3));
        assertEquals(2, instance.bulbSwitch(4));
        assertEquals(2, instance.bulbSwitch(5));
        assertEquals(2, instance.bulbSwitch(6));
        assertEquals(2, instance.bulbSwitch(7));
        assertEquals(2, instance.bulbSwitch(8));
        assertEquals(3, instance.bulbSwitch(9));
        assertEquals(3, instance.bulbSwitch(10));
    }
}
