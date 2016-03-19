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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
