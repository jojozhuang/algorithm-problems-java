package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution294;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution294Test {
    
    public Solution294Test() {
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
     * Test of canWin method, of class Solution294.
     */
    @Test
    public void testCanWin() {
        System.out.println("canWin");
        String s = "";
        Solution294 instance = new Solution294();
        boolean expResult = false;
        boolean result = instance.canWin(s);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.canWin("++++"));
        assertEquals(false, instance.canWin("+--+"));
        assertEquals(true, instance.canWin("++-+"));
        assertEquals(true, instance.canWin("+-++-+-"));
        assertEquals(false, instance.canWin("+-++-+-++"));
    }
}
