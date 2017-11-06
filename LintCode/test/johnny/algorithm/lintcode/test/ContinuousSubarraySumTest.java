/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode.test;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.lintcode.ContinuousSubarraySum;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class ContinuousSubarraySumTest {
    
    public ContinuousSubarraySumTest() {
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
     * Test of continuousSubarraySum method, of class ContinuousSubarraySum.
     */
    @Test
    public void testContinuousSubarraySum() {
        System.out.println("continuousSubarraySum");
        int[] A = null;
        ContinuousSubarraySum instance = new ContinuousSubarraySum();
        ArrayList<Integer> expResult = new ArrayList<Integer>();
        ArrayList<Integer> result = instance.continuousSubarraySum(A);
        assertEquals(expResult, result);
        
        ArrayList<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(1);
        expResult2.add(4);
        assertEquals(expResult2, instance.continuousSubarraySum(new int[]{-3,1,3,-3,4}));
        ArrayList<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(0);
        expResult3.add(0);
        assertEquals(expResult3, instance.continuousSubarraySum(new int[]{1,-1}));
        ArrayList<Integer> expResult4 = new ArrayList<Integer>();
        expResult4.add(4);
        expResult4.add(7);
        assertEquals(expResult4, instance.continuousSubarraySum(new int[]{-1,-2,-3,-100,1,2,3,100}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
