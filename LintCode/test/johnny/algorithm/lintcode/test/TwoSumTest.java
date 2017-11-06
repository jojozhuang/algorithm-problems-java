/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.lintcode.TwoSum;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class TwoSumTest {
    
    public TwoSumTest() {
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
     * Test of twoSum method, of class TwoSum.
     */
    @Test
    public void testTwoSum() {
        System.out.println("twoSum");
        int[] numbers = null;
        int target = 0;
        TwoSum instance = new TwoSum();
        int[] expResult = new int[] {0, 0};
        int[] result = instance.twoSum(numbers, target);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(expResult, instance.twoSum2(new int[] { 0 }, 3));
        assertArrayEquals(expResult, instance.twoSum2(new int[] { 0, 2 }, 3));
        assertArrayEquals(new int[] {1, 2}, instance.twoSum2(new int[] { 4, 5 }, 9));
        assertArrayEquals(new int[] {1, 2}, instance.twoSum2(new int[] { 2, 7 , 11, 15 }, 9));
        assertArrayEquals(new int[] {1, 4}, instance.twoSum2(new int[] { 2, 7 , 11, 15 }, 17));
        assertArrayEquals(new int[] {2, 3}, instance.twoSum2(new int[] { 1, 0, -1 }, -1));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
