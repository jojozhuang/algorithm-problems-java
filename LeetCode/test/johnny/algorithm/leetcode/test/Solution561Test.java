/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution561;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution561Test {
    
    public Solution561Test() {
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
     * Test of arrayPairSum method, of class Solution561.
     */
    @Test
    public void testArrayPairSum() {
        System.out.println("arrayPairSum");
        Solution561 instance = new Solution561();
        
        assertEquals(0, instance.arrayPairSum(new int[]{}));
        assertEquals(1, instance.arrayPairSum(new int[]{1,2}));
        assertEquals(3, instance.arrayPairSum(new int[]{3,0,1,4}));
        assertEquals(4, instance.arrayPairSum(new int[]{1,4,3,2}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
