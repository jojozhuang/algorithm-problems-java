/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
public class Solution167Test {
    
    public Solution167Test() {
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
     * Test of twoSum method, of class Solution167.
     */
    @Test
    public void testTwoSum() {
        System.out.println("twoSum");
        Solution167 instance = new Solution167();

        assertArrayEquals(new int[]{-1,-1}, instance.twoSum(null, 0));
        
        assertArrayEquals(new int[]{1,2}, instance.twoSum(new int[]{2, 7, 11, 15}, 9));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
