package johnny.lintcode.algorithm.test;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.ZeroSubarraySum;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class ZeroSubarraySumTest {
    
    public ZeroSubarraySumTest() {
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
     * Test of subarraySum method, of class ZeroSubarraySum.
     */
    @Test
    public void testSubarraySum() {
        System.out.println("subarraySum");
        int[] nums = null;
        ZeroSubarraySum instance = new ZeroSubarraySum();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.subarraySum(nums);
        assertEquals(expResult, result);
        
        ArrayList<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(0);
        expResult2.add(2);
        assertEquals(expResult2, instance.subarraySum(new int[] { -3, 1, 2, -3, 4}));
        
        ArrayList<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(1);
        expResult3.add(3);
        assertEquals(expResult3, instance.subarraySum(new int[] { 5, -1, 2, -1, 2}));
    }
}
