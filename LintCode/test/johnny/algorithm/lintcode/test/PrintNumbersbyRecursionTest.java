/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.lintcode.PrintNumbersbyRecursion;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class PrintNumbersbyRecursionTest {
    
    public PrintNumbersbyRecursionTest() {
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
     * Test of numbersByRecursion method, of class PrintNumbersbyRecursion.
     */
    @Test
    public void testNumbersByRecursion() {
        System.out.println("numbersByRecursion");
        int n = 0;
        PrintNumbersbyRecursion instance = new PrintNumbersbyRecursion();
        List<Integer> expResult =  new ArrayList<Integer>();
        List<Integer> result = instance.numbersByRecursion(n);
        assertEquals(expResult, result);
        
         List<Integer> expResult2 =  new ArrayList<Integer>();
         for (int i = 1; i < 10; i++) {
             expResult2.add(i);
         }
        assertEquals(expResult2, instance.numbersByRecursion(1));
        List<Integer> expResult3 =  new ArrayList<Integer>();
         for (int i = 1; i < 100; i++) {
             expResult3.add(i);
         }
        assertEquals(expResult3, instance.numbersByRecursion(2));
    }
}
