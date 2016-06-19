/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
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
public class Solution229Test {
    
    public Solution229Test() {
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
     * Test of majorityElement method, of class Solution229.
     */
    @Test
    public void testMajorityElement() {
        System.out.println("majorityElement");
        int[] nums = null;
        Solution229 instance = new Solution229();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.majorityElement(nums);
        assertEquals(expResult, result);
        
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(2);
        expResult2.add(3);
        List<Integer> result2 = instance.majorityElement(new int[]{1,2,2,3,3,2,3});
        assertTrue(expResult2.containsAll(result2) && result2.containsAll(expResult2));
        
        List<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(1);
        List<Integer> result3 = instance.majorityElement(new int[]{1, 2, 1, 2, 1, 3, 3});
        assertTrue(expResult3.containsAll(result3) && result3.containsAll(expResult3));
        
        List<Integer> expResult4 = new ArrayList<Integer>();
        expResult4.add(1);
        expResult4.add(2);
        List<Integer> result4 = instance.majorityElement(new int[]{1,2,2,3,2,1,1,3});
        assertTrue(expResult4.containsAll(result4) && result4.containsAll(expResult4));
        
        List<Integer> expResult5 = new ArrayList<Integer>();
        expResult5.add(1);
        expResult5.add(2);
        List<Integer> result5 = instance.majorityElement(new int[]{1, 2});
        assertTrue(expResult5.containsAll(result5) && result5.containsAll(expResult5));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
