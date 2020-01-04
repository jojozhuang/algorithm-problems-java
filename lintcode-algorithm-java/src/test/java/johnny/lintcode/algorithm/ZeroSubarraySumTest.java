package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

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
        ArrayList<Integer> expect1 = new ArrayList<Integer>();
        expect1.add(0);
        expect1.add(0);
        List<Integer> result1 = instance.subarraySum(nums);
        assertEquals(expect1, result1);
        
        ArrayList<Integer> expect2 = new ArrayList<Integer>();
        expect2.add(0);
        expect2.add(2);
        assertEquals(expect2, instance.subarraySum(new int[] { -3, 1, 2, -3, 4}));
        
        ArrayList<Integer> expect3 = new ArrayList<Integer>();
        expect3.add(1);
        expect3.add(3);
        assertEquals(expect3, instance.subarraySum(new int[] { 5, -1, 2, -1, 2}));

        ArrayList<Integer> expect4 = new ArrayList<Integer>();
        expect4.add(0);
        expect4.add(0);
        assertEquals(expect4, instance.subarraySum(new int[] { 0 }));
    }
}
