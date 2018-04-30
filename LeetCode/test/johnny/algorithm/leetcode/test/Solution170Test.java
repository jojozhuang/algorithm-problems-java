package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution170;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution170Test {
    
    public Solution170Test() {
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
     * Test of find method, of class Solution170.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Solution170 instance = new Solution170();
        instance.add(1);
        instance.add(3);
        instance.add(5);
        assertEquals(true, instance.find(4));
        assertEquals(false, instance.find(7));
        assertEquals(true, instance.find(8));
        assertEquals(false, instance.find(3));
        instance.add(5);
        assertEquals(true, instance.find(10));
    }
}
