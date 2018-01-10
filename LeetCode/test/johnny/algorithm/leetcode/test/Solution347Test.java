package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution347;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution347Test {
    
    public Solution347Test() {
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
     * Test of topKFrequent method, of class Solution347.
     */
    @Test
    public void testTopKFrequent() {
        System.out.println("topKFrequent");
        int[] nums = null;
        int k = 0;
        Solution347 instance = new Solution347();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.topKFrequent(nums, k);
        assertEquals(expResult, result);
        
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(1);
        expResult2.add(2);
        assertEquals(expResult2, instance.topKFrequent(new int[]{1,1,1,2,2,3}, 2));
        List<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(1);
        expResult3.add(2);
        expResult3.add(3);
        assertEquals(expResult3, instance.topKFrequent(new int[]{1,1,1,2,2,3}, 3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
