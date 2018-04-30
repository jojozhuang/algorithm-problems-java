package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution268;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution268Test {
    
    public Solution268Test() {
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
     * Test of missingNumber method, of class Solution268.
     */
    @Test
    public void testMissingNumber() {
        System.out.println("missingNumber");
        Solution268 instance = new Solution268();

        assertEquals(0, instance.missingNumber(null));
        assertEquals(2, instance.missingNumber(new int[]{0,1,3}));
        assertEquals(3, instance.missingNumber(new int[]{0,1,2,4}));
        assertEquals(5, instance.missingNumber(new int[]{0,1,2,3,4,6,7,8,9,10}));
    }
}
