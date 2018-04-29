package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution292;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution292Test {
    
    public Solution292Test() {
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
     * Test of canWinNim method, of class Solution292.
     */
    @Test
    public void testCanWinNim() {
        System.out.println("canWinNim");

        Solution292 instance = new Solution292();

        assertEquals(false, instance.canWinNim(0));
        assertEquals(false, instance.canWinNim(4));
        assertEquals(true, instance.canWinNim(3));
    }
}
