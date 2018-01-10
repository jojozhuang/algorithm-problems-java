package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution315;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution315Test {
    
    public Solution315Test() {
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
     * Test of countSmaller method, of class Solution315.
     */
    @Test
    public void testCountSmaller() {
        System.out.println("countSmaller");
        int[] nums = null;
        Solution315 instance = new Solution315();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.countSmaller(nums);
        assertEquals(expResult, result);
        
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(2);
        expResult2.add(1);
        expResult2.add(1);
        expResult2.add(0);
        assertEquals(expResult2, instance.countSmaller(new int[] {5,2,6,1}));
        
        List<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(3);
        expResult3.add(2);
        expResult3.add(1);
        expResult3.add(0);
        assertEquals(expResult3, instance.countSmaller(new int[] {5,4,3,1}));
        
        List<Integer> expResult4 = new ArrayList<Integer>();
        expResult4.add(0);
        expResult4.add(0);
        expResult4.add(0);
        expResult4.add(0);
        assertEquals(expResult4, instance.countSmaller(new int[] {1,4,6,7}));
        
        List<Integer> expResult5 = new ArrayList<Integer>();
        expResult5.add(0);
        expResult5.add(2);
        expResult5.add(0);
        expResult5.add(0);
        assertEquals(expResult5, instance.countSmaller(new int[] {5,6,5,5}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
