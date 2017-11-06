/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution089;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution089Test {
    
    public Solution089Test() {
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
     * Test of grayCode method, of class Solution089.
     */
    @Test
    public void testGrayCode() {
        System.out.println("grayCode");
        Solution089 instance = new Solution089();
        List<Integer> expResult = new ArrayList<Integer>();
        expResult.add(0);
        List<Integer> result = instance.grayCode(0);
        assertEquals(expResult, result);
        
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(0);
        expResult2.add(1);
        assertEquals(expResult2, instance.grayCode(1));
        
        List<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(0);
        expResult3.add(1);
        expResult3.add(3);
        expResult3.add(2);
        assertEquals(expResult3, instance.grayCode(2));
        
         List<Integer> expResult4 = new ArrayList<Integer>();
        expResult4.add(0);
        expResult4.add(1);
        expResult4.add(3);
        expResult4.add(2);
        expResult4.add(6);
        expResult4.add(7);
        expResult4.add(5);
        expResult4.add(4);
        assertEquals(expResult4, instance.grayCode(3));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
