package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution060;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution060Test {
    
    public Solution060Test() {
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
     * Test of getPermutation method, of class Solution060.
     */
    @Test
    public void testGetPermutation() {
        System.out.println("getPermutation");
        Solution060 instance = new Solution060();

        assertEquals("", instance.getPermutation(0, 0));
        assertEquals("", instance.getPermutation(1, 123123));
        assertEquals("", instance.getPermutation(2, 0));
        assertEquals("12", instance.getPermutation(2, 1));
        assertEquals("21", instance.getPermutation(2, 2));
        assertEquals("", instance.getPermutation(3, 7));
        assertEquals("123", instance.getPermutation(3, 1));
        assertEquals("321", instance.getPermutation(3, 6));
        assertEquals("248716395", instance.getPermutation(9, 54494));
    }
}
