/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.cc150.BitManipulation;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class BitManipulationTest {
    
    public BitManipulationTest() {
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
     * Test of add method, of class BitManipulation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        BitManipulation instance = new BitManipulation();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        
        assertEquals(5, instance.add(3, 2));
        assertEquals(-3, instance.add(-2, -1));
        assertEquals(1, instance.add(1, 0));
    }
    
}
