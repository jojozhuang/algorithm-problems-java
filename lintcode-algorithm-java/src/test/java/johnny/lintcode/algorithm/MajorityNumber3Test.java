package johnny.lintcode.algorithm;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class MajorityNumber3Test {
    
    public MajorityNumber3Test() {
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
     * Test of majorityNumber method, of class MajorityNumber3.
     */
    @Test
    public void testMajorityNumber() {
        System.out.println("majorityNumber");
        ArrayList<Integer> nums = null;
        int k = 0;
        MajorityNumber3 instance = new MajorityNumber3();
        int expResult = 0;
        int result = instance.majorityNumber(nums, k);
        assertEquals(expResult, result);
        
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(2);
        nums2.add(3);                        
        assertEquals(2, instance.majorityNumber(nums2, 3));

        ArrayList<Integer> nums3 = new ArrayList<Integer>();
        nums3.add(1);
        nums3.add(2);
        nums3.add(2);
        nums3.add(3);  
        nums3.add(3); 
        nums3.add(3); 
        assertEquals(3, instance.majorityNumber(nums3, 3));
        
        ArrayList<Integer> nums4 = new ArrayList<Integer>();
        nums4.add(3);
        nums4.add(1);
        nums4.add(2);
        nums4.add(3);  
        nums4.add(2); 
        nums4.add(3); 
        nums4.add(3); 
        nums4.add(4);         
        assertEquals(3, instance.majorityNumber(nums4, 3));
    }
}
