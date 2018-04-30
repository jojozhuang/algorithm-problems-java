package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution038;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution038Test {
    
    public Solution038Test() {
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
     * Test of countAndSay method, of class Solution038.
     */
    @Test
    public void testCountAndSay() {
        System.out.println("countAndSay");
        Solution038 instance = new Solution038();

        assertEquals("", instance.countAndSay(0));
        assertEquals("1", instance.countAndSay(1));
        assertEquals("11", instance.countAndSay(2));
        assertEquals("21", instance.countAndSay(3));
        assertEquals("1211", instance.countAndSay(4));
        assertEquals("111221", instance.countAndSay(5));
    }
}
