package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution650;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution650Test {
    
    public Solution650Test() {
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
     * Test of minSteps method, of class Solution650.
     */
    @Test
    public void testMinSteps() {
        System.out.println("minSteps");
        Solution650 instance = new Solution650();

        assertEquals(0, instance.minSteps(0));
        assertEquals(2, instance.minSteps(2));
        assertEquals(3, instance.minSteps(3));
        assertEquals(4, instance.minSteps(4));
        assertEquals(5, instance.minSteps(5));
        assertEquals(6, instance.minSteps(8));
        assertEquals(6, instance.minSteps(9));
    }
}
