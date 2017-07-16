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
public class Solution412Test {
    
    public Solution412Test() {
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
     * Test of fizzBuzz method, of class Solution412.
     */
    @Test
    public void testFizzBuzz() {
        System.out.println("fizzBuzz");
        Solution412 instance = new Solution412();
        List<String> expResult = new ArrayList<String>();
        assertEquals(expResult, instance.fizzBuzz(0));
        List<String> expResult1 = new ArrayList<String>();
        expResult1.add("1");
        assertEquals(expResult1, instance.fizzBuzz(1));
        
        List<String> expResult2 = new ArrayList<String>();
        expResult2.add("1");
        expResult2.add("2");
        expResult2.add("Fizz");
        expResult2.add("4");
        expResult2.add("Buzz");
        assertEquals(expResult2, instance.fizzBuzz(5));
        
        List<String> expResult3 = new ArrayList<String>();
        expResult3.add("1");
        expResult3.add("2");
        expResult3.add("Fizz");
        expResult3.add("4");
        expResult3.add("Buzz");
        expResult3.add("Fizz");
        expResult3.add("7");
        expResult3.add("8");
        expResult3.add("Fizz");
        expResult3.add("Buzz");
        expResult3.add("11");
        expResult3.add("Fizz");
        expResult3.add("13");
        expResult3.add("14");
        expResult3.add("FizzBuzz");
        assertEquals(expResult3, instance.fizzBuzz(15));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
