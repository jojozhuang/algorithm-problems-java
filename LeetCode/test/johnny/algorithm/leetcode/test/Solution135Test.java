package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution135;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution135Test {
    
    public Solution135Test() {
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
     * Test of candy method, of class Solution135.
     */
    @Test
    public void testCandy() {
        System.out.println("candy");
        Solution135 instance = new Solution135();

        assertEquals(0, instance.candy(null));
        assertEquals(12, instance.candy(new int[]{1,4,3,1,2,3}));
    }
}
