package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution299;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution299Test {
    
    public Solution299Test() {
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
     * Test of getHint method, of class Solution299.
     */
    @Test
    public void testGetHint() {
        System.out.println("getHint");
        Solution299 instance = new Solution299();

        assertEquals("0A0B", instance.getHint("", ""));
        assertEquals("1A0B", instance.getHint("12", "13"));
        assertEquals("0A2B", instance.getHint("12", "21"));
        assertEquals("2A0B", instance.getHint("123", "113"));
        assertEquals("2A2B", instance.getHint("1234", "1432"));
        assertEquals("1A3B", instance.getHint("1807", "7810"));
        assertEquals("1A1B", instance.getHint("1123", "0111"));
    }
}
