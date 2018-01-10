package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution492;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution492Test {
    
    public Solution492Test() {
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
     * Test of constructRectangle method, of class Solution492.
     */
    @Test
    public void testConstructRectangle() {
        System.out.println("constructRectangle");
        Solution492 instance = new Solution492();
        assertArrayEquals(new int[]{}, instance.constructRectangle(0));
        assertArrayEquals(new int[]{1,1}, instance.constructRectangle(1));
        assertArrayEquals(new int[]{2,1}, instance.constructRectangle(2));
        assertArrayEquals(new int[]{2,2}, instance.constructRectangle(4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
