package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution476;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution476Test {
    
    public Solution476Test() {
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
     * Test of findComplement method, of class Solution476.
     */
    @Test
    public void testFindComplement() {
        System.out.println("findComplement");
        Solution476 instance = new Solution476();

        assertEquals(2, instance.findComplement(5));
        assertEquals(0, instance.findComplement(1));
        assertEquals(0, instance.findComplement(3));
        assertEquals(0, instance.findComplement(7));
        assertEquals(7, instance.findComplement(8));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
