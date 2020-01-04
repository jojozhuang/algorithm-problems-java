package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class PreviousPermutationTest {
    
    public PreviousPermutationTest() {
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
     * Test of previousPermuation method, of class PreviousPermutation.
     */
    @Test
    public void testPreviousPermuation() {
        System.out.println("previousPermuation");
        ArrayList<Integer> nums = null;
        PreviousPermutation instance = new PreviousPermutation();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.previousPermuation(nums);
        assertEquals(expResult, result);
        
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(1);
        ArrayList<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(1);
        assertEquals(expResult2, instance.previousPermuation(nums2));
        
        ArrayList<Integer> nums3 = new ArrayList<Integer>();
        nums3.add(1);
        nums3.add(2);
        ArrayList<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(2);
        expResult3.add(1);
        assertEquals(expResult3, instance.previousPermuation(nums3));
        
        ArrayList<Integer> nums4 = new ArrayList<Integer>();
        nums4.add(2);
        nums4.add(1);
        ArrayList<Integer> expResult4 = new ArrayList<Integer>();
        expResult4.add(1);
        expResult4.add(2);
        assertEquals(expResult4, instance.previousPermuation(nums4));
        
        ArrayList<Integer> nums5 = new ArrayList<Integer>();
        nums5.add(1);
        nums5.add(2);
        nums5.add(3);
        ArrayList<Integer> expResult5 = new ArrayList<Integer>();
        expResult5.add(3);
        expResult5.add(2);
        expResult5.add(1);
        assertEquals(expResult5, instance.previousPermuation(nums5));
        
        ArrayList<Integer> nums6 = new ArrayList<Integer>();
        nums6.add(1);
        nums6.add(3);
        nums6.add(2);
        nums6.add(3);
        ArrayList<Integer> expResult6 = new ArrayList<Integer>();
        expResult6.add(1);
        expResult6.add(2);
        expResult6.add(3);
        expResult6.add(3);
        assertEquals(expResult6, instance.previousPermuation(nums6));
        
        ArrayList<Integer> nums7 = new ArrayList<Integer>();
        nums7.add(1);
        nums7.add(2);
        nums7.add(3);
        nums7.add(4);
        ArrayList<Integer> expResult7 = new ArrayList<Integer>();
        expResult7.add(4);
        expResult7.add(3);
        expResult7.add(2);
        expResult7.add(1);
        assertEquals(expResult7, instance.previousPermuation(nums7));
    }
}
