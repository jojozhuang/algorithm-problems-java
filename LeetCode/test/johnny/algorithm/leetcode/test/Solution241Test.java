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

import johnny.algorithm.leetcode.Solution241;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution241Test {
    
    public Solution241Test() {
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
     * Test of diffWaysToCompute method, of class Solution241.
     */
    @Test
    public void testDiffWaysToCompute() {
        System.out.println("diffWaysToCompute");
        String input = "";
        Solution241 instance = new Solution241();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.diffWaysToCompute(input);
        assertEquals(expResult, result);
        
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(0);
        expResult2.add(2);
        List<Integer> result2 = instance.diffWaysToCompute("2-1-1");
        assertTrue(expResult2.containsAll(result2) && result2.containsAll(expResult2));
        
        List<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(-34);
        expResult3.add(-14);
        expResult3.add(-10);
        expResult3.add(-10);
        expResult3.add(10);
        List<Integer> result3 = instance.diffWaysToCompute("2*3-4*5");
        assertTrue(expResult3.containsAll(result3) && result3.containsAll(expResult3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
